package ru.anb.sportapp.models.Listmodels


import com.google.gson.annotations.SerializedName

data class X1(
    @SerializedName("В")
    val w: Int,
    @SerializedName("Игры")
    val games: Int,
    @SerializedName("Команда")
    val comands: String,
    @SerializedName("Мячи")
    val boll: String,
    @SerializedName("Н")
    val n: Int,
    @SerializedName("Очки")
    val point: Int,
    @SerializedName("% очков")
    val points: String,
    @SerializedName("П")
    val p: Int
)