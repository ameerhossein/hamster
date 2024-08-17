package net

import ANSI_CYAN
import ANSI_GREEN
import ANSI_PURPLE
import ANSI_RED
import ANSI_RESET
import ANSI_WHITE
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.util.*
import kotlin.system.exitProcess
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.seconds

val client = OkHttpClient()
val gson = Gson()
val hamster = LibHamster()

fun main(): Unit = runBlocking {
    print("\u001b[H\u001b[2J")
    System.out.flush();
    val authFile = File("auth")
    if (!authFile.exists()) authFile.createNewFile()
    val auth = Files.readString(authFile.toPath())
    if (auth.isNullOrBlank()) {
        println("${ANSI_PURPLE}Please enter your bearer token: $ANSI_RESET")
        while (true) {
            val scanner = Scanner(System.`in`).nextLine()
            if (scanner.isNullOrBlank() || !scanner.startsWith("Bearer") || scanner.length < 40) {
                println("$ANSI_RED Invalid token. Please enter your token: $ANSI_RESET")
            } else {
                Files.writeString(File("auth").toPath(), scanner, StandardCharsets.UTF_8)
                break;
            }
        }
    }
    println("${ANSI_CYAN}Welcome! Choose an option")
    println("${ANSI_WHITE}1) Claimer agent")
    println("2) Optimal upgrade")
    while (true) {
        val scanner = Scanner(System.`in`).nextLine()
        if (!scanner.equals("1") && !scanner.equals("2")) println("Invalid option!")
        print("\u001b[H\u001b[2J")
        System.out.flush();
        if (scanner.equals("1")) {
            claimAgent()
        } else if (scanner.equals("2")) {
            optimalUpgrades()
        }
    }





}

suspend fun claimAgent() {
    while (true) {
        val sync = hamster.sync();
        println("${ANSI_GREEN}Claimed " + sync.clickerUser.lastPassiveEarn.toInt() + " coins$ANSI_RESET")
        val delay = (30..125).random().minutes
        println("Next claim will be after $delay")
        delay(delay.inWholeMilliseconds)
    }
}

suspend fun optimalUpgrades() {
    val sync = hamster.sync();
    val ignoreFile = File("ignore")
    if (!ignoreFile.exists()) ignoreFile.createNewFile()
    val ignoreList = withContext(Dispatchers.IO) { Files.readAllLines(ignoreFile.toPath()) }
    var coins = sync.clickerUser.balanceCoins
    println("Ignore list: ${ignoreList.size}")
    ignoreList.forEach {
        println(it)
    }
    while (true) {
        val upgrades = hamster.upgradesForBuy()
        val optimal = upgrades.upgradesForBuy.maxBy {
            if (!it.isAvailable || it.isExpired) return@maxBy 0.0
            if (ignoreList.any { ign -> ign.trim().equals(it.id, true) }) {
                return@maxBy 0.0
            }
            if (it.profitPerHourDelta == 0L) return@maxBy 0.0
            it.profitPerHourDelta.toDouble() / it.price.toDouble()
        }
        if (coins - optimal.price - 10000 <= 0) {
            println("${ANSI_RED}You are out of coins!")
            exitProcess(1)
        }
        if (optimal.cooldownSeconds != 0L && optimal.cooldownSeconds != null) {
            println("Waiting ${optimal.cooldownSeconds.seconds} for ${optimal.id}")
            if (ignoreList.firstOrNull().equals("*")) {
                ignoreList.add(optimal.id)
                continue
            } else {
                delay(optimal.cooldownSeconds.seconds.inWholeMilliseconds + 10000)
            }
        }
        hamster.buyUpgrade(optimal.id)
        coins -= optimal.price
        println("${ANSI_GREEN}Upgraded ${optimal.name} for ${optimal.price} coins\n Added profit: ${optimal.profitPerHourDelta} ${ANSI_RESET}\n")
        delay(5000)
    }
}

