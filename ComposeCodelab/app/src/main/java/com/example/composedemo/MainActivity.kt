package com.example.composedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.ExpandedHeight
import androidx.ui.material.Divider
import androidx.ui.tooling.preview.Preview
import com.example.composedemo.composable.Counter
import com.example.composedemo.composable.Form
import com.example.composedemo.composable.Greeting
import com.example.composedemo.composable.MyApp
import com.example.composedemo.model.CounterState
import com.example.composedemo.model.FormState

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyScreenContent(counterState: CounterState = CounterState()) {
    Column(modifier = ExpandedHeight, crossAxisAlignment = CrossAxisAlignment.Center) {
        Column(modifier = Flexible(1f), crossAxisAlignment = CrossAxisAlignment.Center) {
            Greeting(name = "Hello")
            Divider(color = Color.Black)
            Greeting(name = "World!")
            Divider(color = Color.Transparent, height = 32.dp)
        }
        Counter(state = counterState)
        Divider(color = Color.Transparent, height = 32.dp)
        Form(formState = FormState(false))
    }
}


@Preview()
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}
