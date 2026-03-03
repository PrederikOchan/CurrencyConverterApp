package com.example.currencyconverterapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val meta: MetaData,
    val data: Map<String, Currency>
)

@Serializable
data class MetaData(
    @SerialName("last_updated_at")
    val lastUpdateAt: String
)

@Entity(tableName = "currencies_table")
@Serializable
data class Currency(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val code: String,
    val value: Double
)