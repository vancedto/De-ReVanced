/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/soundcloud/analytics/Fingerprints.kt
 */

package app.morphe.patches.soundcloud.analytics

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object CreateTrackingApiFingerprint : Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "L",
    custom = { methodDef, _ ->
        methodDef.name == "create"
    },
    strings = listOf("backend", "boogaloo"),
)

