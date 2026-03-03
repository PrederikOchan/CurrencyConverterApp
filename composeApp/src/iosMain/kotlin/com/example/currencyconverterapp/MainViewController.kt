package com.example.currencyconverterapp

import androidx.compose.ui.window.ComposeUIViewController
import com.example.currencyconverterapp.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }