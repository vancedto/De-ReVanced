/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/iconpackstudio/misc/pro/Fingerprints.kt
 */

package app.morphe.patches.iconpackstudio.misc.pro

import app.morphe.patcher.Fingerprint

internal object CheckProFingerprint : Fingerprint(
    returnType = "Z",
    custom = { _, classDef -> classDef.endsWith("IPSPurchaseRepository;") },
)

