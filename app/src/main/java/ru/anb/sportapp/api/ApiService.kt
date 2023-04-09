package ru.anb.sportapp.api

import retrofit2.Response
import retrofit2.http.GET
import ru.anb.sportapp.models.news.NewsItem

interface ApiService {
    @GET("news.json/")
   suspend fun getNewsList(): Response<List<NewsItem>>
}