package com.example.currencyconverterapp.domain.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.currencyconverterapp.domain.model.Currency
import kotlinx.coroutines.flow.Flow

@Dao
interface CurrencyDao {
    @Query("SELECT * FROM currencies_table")
    fun getAllCurrencies(): Flow<List<Currency>>

    @Insert
    suspend fun insert(item: Currency)

    @Query("DELETE FROM currencies_table")
    suspend fun deleteAll()

}