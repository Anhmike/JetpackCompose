package com.example.composedemo.composable

import androidx.compose.Composable
import com.example.composedemo.styles.CustomTheme

@Composable
fun MyApp(child: @Composable() () -> Unit) {
    CustomTheme {
        child()
    }
}

