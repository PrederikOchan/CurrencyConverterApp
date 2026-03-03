package com.example.currencyconverterapp

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.currencyconverterapp.domain.db.AppDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<AppDatabase> {
    val context: Context = context.applicationContext
    val dbFile = context.getDatabasePath("currency_app.db")
    return Room.databaseBuilder<AppDatabase>(
        context = context,
        name = dbFile.absolutePath
    )
}