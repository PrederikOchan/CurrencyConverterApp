package com.example.currencyconverterapp.data

import com.example.currencyconverterapp.domain.CurrencyRepository
import com.example.currencyconverterapp.domain.db.dao.CurrencyDao
import com.example.currencyconverterapp.domain.model.Currency
import com.example.currencyconverterapp.domain.model.RequestState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CurrencyRepositoryImpl(private val currencyDao: CurrencyDao): CurrencyRepository {
    override fun getCurrencies(): Flow<RequestState<List<Currency>>> {
        return currencyDao.getAllCurrencies().map { result ->
            RequestState.Success(result)
        }
    }

    override suspend fun insertCurrency(currency: Currency) {
        return currencyDao.insert(currency)
    }

    override suspend fun deleteAll() {
        return currencyDao.deleteAll()
    }
}