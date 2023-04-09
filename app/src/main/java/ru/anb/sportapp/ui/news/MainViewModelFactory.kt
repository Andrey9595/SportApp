package ru.anb.sportapp.ui.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.anb.sportapp.api.ApiService


class MainViewModelFactory constructor(
    private val retrofit: ApiService
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelNews::class.java)) {
            return ViewModelNews(retrofit) as T
        }
        throw java.lang.IllegalArgumentException("Unknown class name")
    }
}