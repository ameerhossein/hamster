package net

import com.google.gson.annotations.SerializedName

data class Sync(
    val clickerUser: ClickerUser,
)

data class ClickerUser(
    val id: String,
    val totalCoins: Double,
    val balanceCoins: Double,
    val level: Long,
    val availableTaps: Long,
    val lastSyncUpdate: Long,
    val exchangeId: String,
    val boosts: Boosts,
    val upgrades: Upgrades,
    val tasks: Tasks,
    val airdropTasks: Map<String, Any>,
    val referralsCount: Long,
    val maxTaps: Long,
    val earnPerTap: Long,
    val earnPassivePerSec: Double,
    val earnPassivePerHour: Long,
    val lastPassiveEarn: Double,
    val tapsRecoverPerSec: Long,
    val referral: Referral,
    val claimedUpgradeComboAt: String,
    val claimedCipherAt: String,
)

data class Boosts(
    @SerializedName("BoostMaxTaps")
    val boostMaxTaps: BoostMaxTaps,
    @SerializedName("BoostEarnPerTap")
    val boostEarnPerTap: BoostEarnPerTap,
)

data class BoostMaxTaps(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class BoostEarnPerTap(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Upgrades(
    @SerializedName("licence_japan")
    val licenceJapan: LicenceJapan,
    @SerializedName("two_factor_authentication")
    val twoFactorAuthentication: TwoFactorAuthentication,
    @SerializedName("anonymous_transactions_ban")
    val anonymousTransactionsBan: AnonymousTransactionsBan,
    @SerializedName("two_chairs")
    val twoChairs: TwoChairs,
    @SerializedName("short_squeeze")
    val shortSqueeze: ShortSqueeze,
    @SerializedName("notcoin_listing")
    val notcoinListing: NotcoinListing,
    @SerializedName("ceo_21m")
    val ceo21m: Ceo21m,
    @SerializedName("fan_tokens")
    val fanTokens: FanTokens,
    @SerializedName("btc_pairs")
    val btcPairs: BtcPairs,
    @SerializedName("eth_pairs")
    val ethPairs: EthPairs,
    @SerializedName("top_10_cmc_pairs")
    val top10CmcPairs: Top10CmcPairs,
    val kyc: Kyc,
    val kyb: Kyb,
    @SerializedName("legal_opinion")
    val legalOpinion: LegalOpinion,
    @SerializedName("support_team")
    val supportTeam: SupportTeam,
    @SerializedName("facebook_ads")
    val facebookAds: FacebookAds,
    val x: X,
    val medium: Medium,
    @SerializedName("security_audition")
    val securityAudition: SecurityAudition,
    @SerializedName("anti_money_loundering")
    val antiMoneyLoundering: AntiMoneyLoundering,
    val staking: Staking,
    val ceo: Ceo,
    val marketing: Marketing,
    @SerializedName("it_team")
    val itTeam: ItTeam,
    @SerializedName("compliance_officer")
    val complianceOfficer: ComplianceOfficer,
    val youtube: Youtube,
    val instagram: Instagram,
    val tiktok: Tiktok,
    @SerializedName("gamefi_tokens")
    val gamefiTokens: GamefiTokens,
    @SerializedName("defi2.0_tokens")
    val defi20Tokens: Defi20Tokens,
    @SerializedName("licence_nigeria")
    val licenceNigeria: LicenceNigeria,
    @SerializedName("licence_ethiopia")
    val licenceEthiopia: LicenceEthiopia,
    @SerializedName("vc_labs")
    val vcLabs: VcLabs,
    @SerializedName("web3_academy_launch")
    val web3AcademyLaunch: Web3AcademyLaunch,
    @SerializedName("hamster_youtube_gold_button")
    val hamsterYoutubeGoldButton: HamsterYoutubeGoldButton,
    @SerializedName("shit_coins")
    val shitCoins: ShitCoins,
    @SerializedName("prediction_markets")
    val predictionMarkets: PredictionMarkets,
    @SerializedName("p2p_trading")
    val p2pTrading: P2pTrading,
    @SerializedName("product_team")
    val productTeam: ProductTeam,
    @SerializedName("bisdev_team")
    val bisdevTeam: BisdevTeam,
    val influencers: Influencers,
    @SerializedName("meme_coins")
    val memeCoins: MemeCoins,
    @SerializedName("margin_trading_x10")
    val marginTradingX10: MarginTradingX10,
    @SerializedName("tokenomics_expert")
    val tokenomicsExpert: TokenomicsExpert,
    @SerializedName("risk_management_team")
    val riskManagementTeam: RiskManagementTeam,
    @SerializedName("ux_ui_team")
    val uxUiTeam: UxUiTeam,
    @SerializedName("security_team")
    val securityTeam: SecurityTeam,
    @SerializedName("blocking_suspicious_accounts")
    val blockingSuspiciousAccounts: BlockingSuspiciousAccounts,
    @SerializedName("licence_uae")
    val licenceUae: LicenceUae,
    @SerializedName("sec_transparancy")
    val secTransparancy: SecTransparancy,
    @SerializedName("licence_north_america")
    val licenceNorthAmerica: LicenceNorthAmerica,
    val reddit: Reddit,
    @SerializedName("qa_team")
    val qaTeam: QaTeam,
    @SerializedName("antihacking_shield")
    val antihackingShield: AntihackingShield,
    @SerializedName("socialfi_tokens")
    val socialfiTokens: SocialfiTokens,
    @SerializedName("margin_trading_x20")
    val marginTradingX20: MarginTradingX20,
    @SerializedName("margin_trading_x30")
    val marginTradingX30: MarginTradingX30,
    @SerializedName("margin_trading_x50")
    val marginTradingX50: MarginTradingX50,
    @SerializedName("top10_global")
    val top10Global: Top10Global,
    @SerializedName("bitcoin_pizza_day")
    val bitcoinPizzaDay: BitcoinPizzaDay,
    @SerializedName("special_hamster_conference")
    val specialHamsterConference: SpecialHamsterConference,
    @SerializedName("apps_center_listing")
    val appsCenterListing: AppsCenterListing,
    @SerializedName("licence_asia")
    val licenceAsia: LicenceAsia,
    @SerializedName("partnership_program")
    val partnershipProgram: PartnershipProgram,
    @SerializedName("trading_bots")
    val tradingBots: TradingBots,
    @SerializedName("consensys_explorer_pass")
    val consensysExplorerPass: ConsensysExplorerPass,
    @SerializedName("licence_europe")
    val licenceEurope: LicenceEurope,
    @SerializedName("licence_australia")
    val licenceAustralia: LicenceAustralia,
    @SerializedName("licence_south_america")
    val licenceSouthAmerica: LicenceSouthAmerica,
    @SerializedName("consensys_piranja_pass")
    val consensysPiranjaPass: ConsensysPiranjaPass,
    @SerializedName("hamster_youtube_channel")
    val hamsterYoutubeChannel: HamsterYoutubeChannel,
    @SerializedName("web3_integration")
    val web3Integration: Web3Integration,
    val derivatives: Derivatives,
    @SerializedName("usdt_on_ton")
    val usdtOnTon: UsdtOnTon,
    @SerializedName("money_20_20")
    val money2020: Money2020,
    @SerializedName("margin_trading_x100")
    val marginTradingX100: MarginTradingX100,
    @SerializedName("nft_collection_launch")
    val nftCollectionLaunch: NftCollectionLaunch,
    val bogdanoff: Bogdanoff,
    @SerializedName("partner_announce")
    val partnerAnnounce: PartnerAnnounce,
    @SerializedName("margin_trading_x75")
    val marginTradingX75: MarginTradingX75,
    @SerializedName("hamster_drop")
    val hamsterDrop: HamsterDrop,
    @SerializedName("premarket_launch")
    val premarketLaunch: PremarketLaunch,
)

data class LicenceJapan(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class TwoFactorAuthentication(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class AnonymousTransactionsBan(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class TwoChairs(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class ShortSqueeze(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class NotcoinListing(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class Ceo21m(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class FanTokens(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class BtcPairs(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class EthPairs(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Top10CmcPairs(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Kyc(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Kyb(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LegalOpinion(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SupportTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class FacebookAds(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class X(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Medium(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SecurityAudition(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class AntiMoneyLoundering(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Staking(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Ceo(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Marketing(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ItTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ComplianceOfficer(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Youtube(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Instagram(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Tiktok(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class GamefiTokens(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Defi20Tokens(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceNigeria(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceEthiopia(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class VcLabs(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Web3AcademyLaunch(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class HamsterYoutubeGoldButton(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ShitCoins(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class PredictionMarkets(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class P2pTrading(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ProductTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class BisdevTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Influencers(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MemeCoins(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX10(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class TokenomicsExpert(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class RiskManagementTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class UxUiTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SecurityTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class BlockingSuspiciousAccounts(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceUae(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SecTransparancy(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceNorthAmerica(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Reddit(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class QaTeam(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class AntihackingShield(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SocialfiTokens(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX20(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX30(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX50(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Top10Global(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class BitcoinPizzaDay(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class SpecialHamsterConference(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class AppsCenterListing(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceAsia(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class PartnershipProgram(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class TradingBots(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ConsensysExplorerPass(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceEurope(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceAustralia(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class LicenceSouthAmerica(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class ConsensysPiranjaPass(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class HamsterYoutubeChannel(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Web3Integration(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Derivatives(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class UsdtOnTon(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Money2020(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX100(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class NftCollectionLaunch(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class Bogdanoff(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class PartnerAnnounce(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class MarginTradingX75(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class HamsterDrop(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
)

data class PremarketLaunch(
    val id: String,
    val level: Long,
    val lastUpgradeAt: Long,
    val snapshotReferralsCount: Long,
)

data class Tasks(
    @SerializedName("streak_days")
    val streakDays: StreakDays,
    @SerializedName("subscribe_telegram_channel")
    val subscribeTelegramChannel: SubscribeTelegramChannel,
    @SerializedName("subscribe_x_account")
    val subscribeXAccount: SubscribeXAccount,
    @SerializedName("select_exchange")
    val selectExchange: SelectExchange,
    @SerializedName("subscribe_youtube_channel")
    val subscribeYoutubeChannel: SubscribeYoutubeChannel,
    @SerializedName("invite_friends")
    val inviteFriends: InviteFriends,
    @SerializedName("watch_youtube_video_hk_cipher")
    val watchYoutubeVideoHkCipher: WatchYoutubeVideoHkCipher,
    @SerializedName("watch_youtube_video_okx")
    val watchYoutubeVideoOkx: WatchYoutubeVideoOkx,
    @SerializedName("hamster_drop")
    val hamsterDrop: HamsterDrop2,
    @SerializedName("hamster_youtube_academy")
    val hamsterYoutubeAcademy: HamsterYoutubeAcademy,
    @SerializedName("hamster_youtube_easy_start")
    val hamsterYoutubeEasyStart: HamsterYoutubeEasyStart,
    @SerializedName("hamster_youtube_academy_s1e2")
    val hamsterYoutubeAcademyS1e2: HamsterYoutubeAcademyS1e2,
    @SerializedName("hamster_youtube_easy_start_s1e2")
    val hamsterYoutubeEasyStartS1e2: HamsterYoutubeEasyStartS1e2,
    @SerializedName("hamster_youtube_academy_s1e3")
    val hamsterYoutubeAcademyS1e3: HamsterYoutubeAcademyS1e3,
    @SerializedName("hamster_youtube_easy_start_s1e3")
    val hamsterYoutubeEasyStartS1e3: HamsterYoutubeEasyStartS1e3,
)

data class StreakDays(
    val id: String,
    val completedAt: String,
    val days: Long,
)

data class SubscribeTelegramChannel(
    val id: String,
    val completedAt: String,
)

data class SubscribeXAccount(
    val id: String,
    val completedAt: String,
)

data class SelectExchange(
    val id: String,
    val completedAt: String,
)

data class SubscribeYoutubeChannel(
    val id: String,
    val completedAt: String,
)

data class InviteFriends(
    val id: String,
    val completedAt: String,
)

data class WatchYoutubeVideoHkCipher(
    val id: String,
    val completedAt: String,
)

data class WatchYoutubeVideoOkx(
    val id: String,
    val completedAt: String,
)

data class HamsterDrop2(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeAcademy(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeEasyStart(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeAcademyS1e2(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeEasyStartS1e2(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeAcademyS1e3(
    val id: String,
    val completedAt: String,
)

data class HamsterYoutubeEasyStartS1e3(
    val id: String,
    val completedAt: String,
)

data class Referral(
    val friend: Friend,
)

data class Friend(
    val id: Long,
    val isBot: Boolean,
    val firstName: String,
    val lastName: String,
    val username: String,
    val languageCode: String,
    val welcomeBonusCoins: Long,
)

data class UpgradesForBuyRoot(
    val upgradesForBuy: List<UpgradesForBuy>,
    val sections: List<Section>,
    val dailyCombo: DailyCombo,
)

data class UpgradesForBuy(
    val id: String,
    val name: String,
    val price: Long,
    val profitPerHour: Long,
    val condition: Condition?,
    val section: String,
    val level: Long,
    val currentProfitPerHour: Long,
    val profitPerHourDelta: Long,
    val isAvailable: Boolean,
    val isExpired: Boolean,
    val cooldownSeconds: Long?,
    val totalCooldownSeconds: Long?,
    val expiresAt: String?,
    val maxLevel: Long?,
    val welcomeCoins: Long?,
)

data class Condition(
    @SerializedName("_type")
    val type: String,
    val moreReferralsCount: Long?,
    val upgradeId: String?,
    val level: Long?,
    val link: String?,
    val channelId: Long?,
    val subscribeLink: String?,
    val links: List<String>?,
    val referralCount: Long?,
)

data class Section(
    val section: String,
    val isAvailable: Boolean,
)

data class DailyCombo(
    val upgradeIds: List<String>,
    val bonusCoins: Long,
    val isClaimed: Boolean,
    val remainSeconds: Long,
)
