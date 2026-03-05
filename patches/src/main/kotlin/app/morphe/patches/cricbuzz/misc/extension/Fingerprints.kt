/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/cricbuzz/misc/extension/Fingerprints.kt
 */

package app.morphe.patches.cricbuzz.misc.extension

import app.morphe.patcher.Fingerprint

internal object ApplicationInitFingerprint : Fingerprint(
    custom = { method, classDef ->
        method.name == "onCreate" && classDef.endsWith("/NyitoActivity;")
    },
)

