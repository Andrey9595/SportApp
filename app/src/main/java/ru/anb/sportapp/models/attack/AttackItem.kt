package ru.anb.sportapp.models.attack


import com.google.gson.annotations.SerializedName

data class AttackItem(
    @SerializedName("Дано фолов з.и.")
    val folls: Double,
    @SerializedName("Дриблинг з.и.")
    val dribling: Double,
    @SerializedName("Команда")
    val comand: String,
    @SerializedName("Рейтинг")
    val reiting: Double,
    @SerializedName("Турнир")
    val turnir: String,
    @SerializedName("Удары ВСтв з.и.")
    val pushes: Double,
    @SerializedName("Удары з.и.")
    val pushesZI: Double
)