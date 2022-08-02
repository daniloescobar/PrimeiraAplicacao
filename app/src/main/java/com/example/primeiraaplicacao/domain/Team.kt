package com.example.primeiraaplicacao.domain

import com.google.gson.annotations.SerializedName

class Team (
    @SerializedName("nome")
    val name: String,
    @SerializedName("força")
    val stars: Int,
    @SerializedName("imagem")
    val image: String
)