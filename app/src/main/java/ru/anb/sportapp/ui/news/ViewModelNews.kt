package ru.anb.sportapp.ui.news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.anb.sportapp.api.ApiResult
import ru.anb.sportapp.api.ApiService
import ru.anb.sportapp.models.news.NewsItem

class ViewModelNews(private val retrofit: ApiService) : ViewModel() {

    var liveData = MutableLiveData<ApiResult<List<NewsItem>>>()

    init {
        loadNews()
    }

    fun loadNews() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = retrofit.getNewsList()
            if (result.isSuccessful) {
                liveData.postValue(ApiResult.Success(result.body()))
            } else liveData.postValue(ApiResult.Error("False"))
        }
    }
}