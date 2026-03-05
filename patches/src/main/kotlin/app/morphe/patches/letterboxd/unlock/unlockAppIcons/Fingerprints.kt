/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/letterboxd/unlock/unlockAppIcons/Fingerprints.kt
 */

package app.morphe.patches.letterboxd.unlock.unlockAppIcons

import app.morphe.patcher.Fingerprint

internal object GetCanChangeAppIconFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "getCanChangeAppIcon" && classDef.type.endsWith("SettingsAppIconFragment;")
    },
)

