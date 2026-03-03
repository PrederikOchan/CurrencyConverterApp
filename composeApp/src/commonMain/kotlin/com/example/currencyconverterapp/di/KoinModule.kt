package com.example.currencyconverterapp.di

import com.example.currencyconverterapp.data.CurrencyRepositoryImpl
import com.example.currencyconverterapp.data.local.PreferencesImpl
import com.example.currencyconverterapp.data.remote.api.CurrencyApiServiceImpl
import com.example.currencyconverterapp.domain.CurrencyApiService
import com.example.currencyconverterapp.domain.CurrencyRepository
import com.example.currencyconverterapp.domain.PreferencesRepository
import com.example.currencyconverterapp.domain.db.AppDatabase
import com.example.currencyconverterapp.domain.db.dao.CurrencyDao
import com.example.currencyconverterapp.presentation.screen.HomeViewModel
import com.russhwolf.settings.Settings
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

val appModule = module {
    single { Settings() }
    single<CurrencyRepository> { CurrencyRepositoryImpl(currencyDao = get()) }
    single<PreferencesRepository> { PreferencesImpl(settings = get()) }
    single<CurrencyApiService> { CurrencyApiServiceImpl(preferences = get()) }
    factory {
        HomeViewModel(
            preferences = get(),
            currencyRepo = get(),
            api = get()
        )
    }
}

val databaseModule = module {
    single<CurrencyDao> { get<AppDatabase>().currencyDao() }
}

fun initializeKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(platformModule())
        modules(databaseModule)
        modules(appModule)
    }
}

fun initKoinIos() = initializeKoin(appDeclaration = {})