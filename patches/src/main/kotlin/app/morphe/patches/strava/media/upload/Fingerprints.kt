/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/strava/media/upload/Fingerprints.kt
 */

package app.morphe.patches.strava.media.upload

import app.morphe.patcher.Fingerprint

internal object GetCompressionQualityFingerprint : Fingerprint(
    custom = { method, _ ->
        method.name == "getCompressionQuality"
    },
)

internal object GetMaxDurationFingerprint : Fingerprint(
    custom = { method, _ ->
        method.name == "getMaxDuration"
    },
)

internal object GetMaxSizeFingerprint : Fingerprint(
    custom = { method, _ ->
        method.name == "getMaxSize"
    },
)

