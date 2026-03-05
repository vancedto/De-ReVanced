/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/strava/media/download/Fingerprints.kt
 */

package app.morphe.patches.strava.media.download

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object CreateAndShowFragmentFingerprint : Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    returnType = "V",
    parameters = listOf("L"),
    strings = listOf("mediaType"),
)

internal object HandleMediaActionFingerprint : Fingerprint(
    parameters = listOf(
        "Landroid/view/View;",
        "Lcom/strava/bottomsheet/BottomSheetItem;",
    ),
)

