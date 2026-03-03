package com.example.currencyconverterapp.domain

import com.example.currencyconverterapp.domain.model.Currency
import com.example.currencyconverterapp.domain.model.RequestState

interface CurrencyApiService {
   suspend fun getLatestExchangeRates(): RequestState<List<Currency>>
}