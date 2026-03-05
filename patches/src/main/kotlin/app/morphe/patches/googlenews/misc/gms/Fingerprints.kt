/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/googlenews/misc/gms/Fingerprints.kt
 */

package app.morphe.patches.googlenews.misc.gms

import app.morphe.patcher.Fingerprint

internal object MagazinesActivityOnCreateFingerprint : Fingerprint(
    custom = { methodDef, classDef ->
        methodDef.name == "onCreate" && classDef.endsWith("/StartActivity;")
    },
)

