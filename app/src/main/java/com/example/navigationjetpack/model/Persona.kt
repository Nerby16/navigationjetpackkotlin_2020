package com.example.navigationjetpack.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Persona(
    val nombre:String,
    val apellido:String
) : Parcelable {
}