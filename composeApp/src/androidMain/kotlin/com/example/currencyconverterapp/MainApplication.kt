package com.example.currencyconverterapp

import android.app.Application
import com.example.currencyconverterapp.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        initializeKoin(
            appDeclaration = {
                androidContext(this@MainApplication)
            }
        )

    }
}