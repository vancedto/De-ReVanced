/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/strava/misc/extension/SharedExtensionPatch.kt
 */

package app.morphe.patches.strava.misc.extension

import app.morphe.patcher.Fingerprint
import app.morphe.patches.shared.misc.extension.ExtensionHook
import app.morphe.patches.shared.misc.extension.sharedExtensionPatch

internal object StravaApplicationOnCreateFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "onCreate" && classDef.endsWith("/StravaApplication;")
    },
)

internal val applicationOnCreateHook = ExtensionHook(
    fingerprint = StravaApplicationOnCreateFingerprint,
)

val sharedExtensionPatch = sharedExtensionPatch(
    extensionName = "strava",
    isYouTubeOrYouTubeMusic = false,
    applicationOnCreateHook,
)

