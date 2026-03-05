/*
 * Forked from:
 * https://github.com/ReVanced/revanced-patches/blob/6b06b9d1328b971a06d10b4247f4c10f050e4f61/patches/src/main/kotlin/app/revanced/patches/tumblr/annoyances/popups/Fingerprints.kt
 */

package app.morphe.patches.tumblr.annoyances.popups

import app.morphe.patcher.Fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

// This method is responsible for loading and displaying the visual Layout of the Gift Message Popup.
internal object ShowGiftMessagePopupFingerprint : Fingerprint(
    accessFlags = listOf(AccessFlags.FINAL, AccessFlags.PUBLIC),
    returnType = "V",
    strings = listOf("activity", "anchorView", "textMessage"),
)

