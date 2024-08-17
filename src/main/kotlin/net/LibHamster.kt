package net

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Call
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import java.io.File
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files

class LibHamster {


    private suspend inline fun <reified T> request(url: String, payload: String? = null): T {
        val auth = withContext(Dispatchers.IO) { Files.readString(File("auth").toPath()) }.trim()
        val request: Request = Request.Builder()
            .url(url)
            .post(payload?.toRequestBody() ?: ByteArray(0).toRequestBody(null))
            .addHeader("Accept", "*/*")
            .addHeader("Accept-Language", "en-US,en;q=0.9,fa-IR;q=0.8,fa;q=0.7")
            .addHeader(
                "Authorization",
                auth
            )
            .addHeader("Connection", "keep-alive")
            .addHeader("Origin", "https://hamsterkombat.io")
            .addHeader("Referer", "https://hamsterkombat.io/")
            .addHeader("Sec-Fetch-Dest", "empty")
            .addHeader("Sec-Fetch-Mode", "cors")
            .addHeader("Sec-Fetch-Site", "same-site")
            .addHeader("Content-Length", calculateContentLength(payload ?: "").toString())
            .addHeader("Host", "api.hamsterkombat.io")
            .addHeader("Content-Type", "application/json")
            .addHeader(
                "User-Agent",
                "Mozilla/5.0 (Linux; Android 14; SM-A245F Build/UP1A.231005.007; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/125.0.6422.165 Mobile Safari/537.36"
            )
            .addHeader("X-Requested-With", "org.telegram.messenger.web")
            .addHeader("sec-ch-ua", "\"Android WebView\";v=\"125\", \"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\"")
            .addHeader("sec-ch-ua-mobile", "?1")
            .addHeader("sec-ch-ua-platform", "\"Android\"")
            .build()

        val call: Call = client.newCall(request)
        val response: Response = call.await()
        if ( response.isSuccessful && T::class == Unit::class) return Unit as T
        val body = response.body?.string() ?: throw IOException("Request failed")
        val obj = gson.fromJson(body, T::class.java) ?: throw IOException("Request failed")
        return obj


    }

    private fun calculateContentLength(input: String): Int {
        val byteArray = input.toByteArray(StandardCharsets.UTF_8)
        return byteArray.size
    }



    suspend fun sync() = request<Sync>("https://api.hamsterkombat.io/clicker/sync")

    suspend fun upgradesForBuy() = request<UpgradesForBuyRoot>("https://api.hamsterkombat.io/clicker/upgrades-for-buy")

    suspend fun buyUpgrade(upgradeId: String) {
        val params = mapOf(
            "timestamp" to System.currentTimeMillis(),
            "upgradeId" to upgradeId,
        )
        return request<Unit>("https://api.hamsterkombat.io/clicker/buy-upgrade", gson.toJson(params))
    }

    suspend fun tap(availableTaps: Int, count: Int) {

        val params = mapOf(
            "availableTaps" to availableTaps,
            "count" to count,
            "timestamp" to System.currentTimeMillis()
        )

        request<Sync>(
            "https://api.hamsterkombat.io/clicker/tap",
            gson.toJson(params)
        )

    }

}