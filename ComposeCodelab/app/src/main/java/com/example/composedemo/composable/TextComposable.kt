package com.example.composedemo.composable

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Spacing
import androidx.ui.material.themeTextStyle

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        modifier = Spacing(24.dp),
        style = +themeTextStyle { h1 }
    )
}