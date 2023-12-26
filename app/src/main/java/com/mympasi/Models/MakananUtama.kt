package com.mympasi.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MakananUtama (
    val img: Int,
    val title: String,

    val desc: String,
    val bahan: String,
    val carar: String,

) :Parcelable