package ru.anb.sportapp.models.Listmodels


import com.google.gson.annotations.SerializedName

data class CountryItem(
    @SerializedName("category")
    val category: String,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("dates")
    val dates: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("players_count")
    val playersCount: Int
)