package ru.anb.sportapp.models.defense


import com.google.gson.annotations.SerializedName

data class DefensItem(
    @SerializedName("Команда")
    val comand: String,
    @SerializedName("Отборы з.и.")
    val selection: Double,
    @SerializedName("Офсайды з.и.")
    val offside: Double,
    @SerializedName("Перехваты з.и.")
    val interection: Double,
    @SerializedName("Рейтинг")
    val reiting: Double,
    @SerializedName("Турнир")
    val tournir: String,
    @SerializedName("Удары з.и.")
    val push: Double,
    @SerializedName("Фолы з.и.")
    val folls: Double
)