/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/strava/groupkudos/Fingerprints.kt
 */

package app.morphe.patches.strava.groupkudos

import app.morphe.patcher.Fingerprint

internal object InitFingerprint : Fingerprint(
    name = "<init>",
    returnType = "V",
    parameters = listOf(
        "Lcom/strava/feed/view/modal/GroupTabFragment;",
        "Z",
        "Landroidx/fragment/app/FragmentManager;",
    ),
)

internal object ActionHandlerFingerprint : Fingerprint(
    strings = listOf("state"),
)

