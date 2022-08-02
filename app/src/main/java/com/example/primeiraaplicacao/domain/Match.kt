package com.example.primeiraaplicacao.domain

import com.google.gson.annotations.SerializedName

data class Match (
    @SerializedName("descrição")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val awayTeam: Team
        )