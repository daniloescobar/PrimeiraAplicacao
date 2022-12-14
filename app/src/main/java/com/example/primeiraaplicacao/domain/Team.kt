package com.example.primeiraaplicacao.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
class Team (
    @SerializedName("nome")
    val name: String,
    @SerializedName("força")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
):Parcelable