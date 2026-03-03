package com.example.currencyconverterapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.example.currencyconverterapp.di.initializeKoin
import com.example.currencyconverterapp.presentation.screen.HomeScreen
import com.example.currencyconverterapp.ui.theme.DarkColors
import com.example.currencyconverterapp.ui.theme.LightColors
import org.jetbrains.compose.resources.painterResource

import currencyconverterapp.composeapp.generated.resources.Res
import currencyconverterapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
//    val color = if (!isSystemInDarkTheme()) LightColors else DarkColors
//    initializeKoin()

    MaterialTheme {
        Navigator(HomeScreen())
    }
}