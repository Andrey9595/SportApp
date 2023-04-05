package ru.anb.sportapp.models.Listmodels

data class ListviewItem(
    val category: String,
    val `data`: Data,
    val dates: String,
    val icon: String,
    val name: String,
    val players_count: Int
)