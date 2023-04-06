package ru.anb.sportapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.anb.sportapp.api.ApiResult
import ru.anb.sportapp.api.ApiService
import ru.anb.sportapp.models.news.NewsItem

class ViewModelNews(private val retrofit: ApiService): ViewModel() {

    lateinit var liveData: MutableLiveData<ApiResult<List<NewsItem>>>

    init {
        loadNews()
    }

    fun loadNews(){
        val result = retrofit.getNewsList()
        if (result.isSuccessful){
            liveData.postValue(ApiResult.Success(result.body()))
        } else liveData.postValue(ApiResult.Error("False"))
    }
}