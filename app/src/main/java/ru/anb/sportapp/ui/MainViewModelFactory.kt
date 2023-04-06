package ru.anb.sportapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MainViewModelFactory constructor(
    private val mainViewModel: ViewModelNews
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelNews::class.java)) {
            return mainViewModel as T
        }
        throw java.lang.IllegalArgumentException("Unknown class name")
    }
}