package ru.anb.sportapp

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.anb.sportapp.api.ApiService
import ru.anb.sportapp.api.RetrofitClient
import ru.anb.sportapp.ui.news.MainViewModelFactory

class App : Application() {

    private lateinit var viewModelFactory: MainViewModelFactory
    private lateinit var retrofit: ApiService

    override fun onCreate() {
        super.onCreate()
        retrofit = Retrofit.Builder()
            .baseUrl(RetrofitClient.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
        viewModelFactory = MainViewModelFactory(retrofit)
    }

    fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner) =
        ViewModelProvider(owner, viewModelFactory)[clazz]
}