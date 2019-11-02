package com.example.composedemo.composable

import androidx.compose.Composable
import androidx.ui.material.Button
import com.example.composedemo.model.CounterState

@Composable
fun Counter(state: CounterState) {
    Button(text = "I've been clicked ${state.counter} times",
        onClick = {
            state.counter++
        })
}