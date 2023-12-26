package com.mympasi.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News (
    val img: Int,
    val title: String,
    val desc: String
) : Parcelable