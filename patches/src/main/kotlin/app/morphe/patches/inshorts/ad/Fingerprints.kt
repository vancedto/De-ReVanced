/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/inshorts/ad/Fingerprints.kt
 */

package app.morphe.patches.inshorts.ad

import app.morphe.patcher.Fingerprint

internal object InshortsAdsFingerprint : Fingerprint(
    returnType = "V",
    strings = listOf("GoogleAdLoader", "exception in requestAd"),
)
