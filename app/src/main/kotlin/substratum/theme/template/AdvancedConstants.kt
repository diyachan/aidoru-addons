package substratum.theme.template

object AdvancedConstants {

    // Dynamic filter that only works on Substratum 627+
    // WARNING: Only enable if you are sure you want certification status to pass on Substratum
    //          before launching the theme, or else it will throw an unauthorized toast!
    const internal val SUBSTRATUM_FILTER_CHECK = false

    // Miscellaneous Checks
    const val ENFORCE_MINIMUM_SUBSTRATUM_VERSION = true
    const val MINIMUM_SUBSTRATUM_VERSION = 712 // 510 is the final MM build

    // Custom message on theme launch, see theme_strings.xml for changing the dialog content
    // Set SHOW_DIALOG_REPEATEDLY to true if you want the dialog to be showed on every theme launch
    const val SHOW_LAUNCH_DIALOG = false
    const val SHOW_DIALOG_REPEATEDLY = false

    // Blacklisted APKs to prevent theme launching, these include simple regex formatting, without
    // full regex formatting (e.g. com.android. will block everything that starts with com.android.)
    val BLACKLISTED_APPLICATIONS = arrayOf(
            "cc.madkite.freedom",
            "zone.jasi2169.uretpatcher",
            "uret.jasi2169.patcher",
            "p.jasi2169.al3",
            "com.dimonvideo.luckypatcher",
            "com.chelpus.lackypatch",
            "com.forpda.lp",
            "com.android.vending.billing.InAppBillingService",
            "com.android.vending.billing.InAppBillingSorvice",
            "com.android.vendinc",
            "com.appcake",
            "ac.market.store",
            "org.sbtools.gamehack",
            "com.zune.gamekiller",
            "com.aag.killer",
            "com.killerapp.gamekiller",
            "cn.lm.sq",
            "net.schwarzis.game_cih",
            "org.creeplays.hack",
            "com.baseappfull.fwd",
            "com.zmapp",
            "com.dv.marketmod.installer",
            "org.mobilism.android",
            "com.blackmartalpha",
            "org.blackmart.market"
    )

    // List of all organization theming systems officially supported by the team
    val ORGANIZATION_THEME_SYSTEMS = arrayOf(
            "projekt.substratum",
            "projekt.substratum.lite",
            "projekt.themer"
    )

    // List of other theme systems that are officially unsupported by the team, but fully supported
    // by their corresponding organizations
    val OTHER_THEME_SYSTEMS = arrayOf(
            "com.slimroms.thememanager",
            "com.slimroms.omsbackend"
    )
}
