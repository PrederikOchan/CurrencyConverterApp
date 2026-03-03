package com.example.currencyconverterapp.domain

import com.example.currencyconverterapp.domain.model.Currency
import com.example.currencyconverterapp.domain.model.RequestState
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    fun getCurrencies(): Flow<RequestState<List<Currency>>>
    suspend fun insertCurrency(currency: Currency)
    suspend fun deleteAll()
}