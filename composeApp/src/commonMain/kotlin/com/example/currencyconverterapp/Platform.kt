package com.example.currencyconverterapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform