package ru.anb.sportapp

import android.app.Application
import ru.anb.sportapp.ui.MainViewModelFactory

class App: Application() {

    private lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate() {
        super.onCreate()
    }
}