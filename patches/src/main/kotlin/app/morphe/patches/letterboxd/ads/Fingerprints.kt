/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/letterboxd/ads/Fingerprints.kt
 */

package app.morphe.patches.letterboxd.ads

import app.morphe.patcher.Fingerprint

internal const val ADMOB_HELPER_CLASS_NAME = "Lcom/letterboxd/letterboxd/helpers/AdmobHelper;"

internal object AdmobHelperSetShowAdsFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "setShowAds" && classDef.type == ADMOB_HELPER_CLASS_NAME
    },
)

internal object AdmobHelperShouldShowAdsFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "shouldShowAds" && classDef.type == ADMOB_HELPER_CLASS_NAME
    },
)

internal object FilmFragmentShowAdsFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "showAds" && classDef.type.endsWith("/FilmFragment;")
    },
)

internal object MemberExtensionShowAdsFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "showAds" && classDef.type.endsWith("/AMemberExtensionKt;")
    },
)

