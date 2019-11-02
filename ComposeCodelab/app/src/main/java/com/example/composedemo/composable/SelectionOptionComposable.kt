package com.example.composedemo.composable

import androidx.compose.Composable
import androidx.ui.material.Checkbox
import com.example.composedemo.model.FormState

@Composable
fun Form(formState: FormState) {
    Checkbox(checked = formState.optionChecked, onCheckedChange = { formState.optionChecked = it })
}