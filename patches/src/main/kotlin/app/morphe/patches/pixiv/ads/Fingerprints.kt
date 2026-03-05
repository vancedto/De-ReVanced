/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/pixiv/ads/Fingerprints.kt
 */

package app.morphe.patches.pixiv.ads

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object ShouldShowAdsFingerprint : Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "Z",
    custom = { methodDef, classDef ->
        classDef.type.endsWith("AdUtils;") && methodDef.name == "shouldShowAds"
    },
)

