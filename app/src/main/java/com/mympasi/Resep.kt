package com.mympasi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Resep(
    var name: String = "",
    var photo: Int = 0
): Parcelable
