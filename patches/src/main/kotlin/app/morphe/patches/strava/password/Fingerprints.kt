/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/strava/password/Fingerprints.kt
 */

package app.morphe.patches.strava.password

import app.morphe.patcher.Fingerprint

internal object LogInGetUsePasswordFingerprint : Fingerprint(
    returnType = "Z",
    custom = { method, classDef ->
        method.name == "getUsePassword" && classDef.endsWith("/RequestOtpLogInNetworkResponse;")
    },
)

internal object EmailChangeGetUsePasswordFingerprint : Fingerprint(
    returnType = "Z",
    custom = { method, classDef ->
        method.name == "getUsePassword" && classDef.endsWith("/RequestEmailChangeWithOtpOrPasswordResponse;")
    },
)

