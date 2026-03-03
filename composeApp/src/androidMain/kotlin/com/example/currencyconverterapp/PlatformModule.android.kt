package com.example.currencyconverterapp.di

import com.example.currencyconverterapp.domain.db.AppDatabase
import com.example.currencyconverterapp.domain.db.getRoomDatabase
import com.example.currencyconverterapp.getDatabaseBuilder
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<AppDatabase> {
        getRoomDatabase(getDatabaseBuilder(get()))
    }
}