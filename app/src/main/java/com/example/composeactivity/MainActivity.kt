package com.example.composeactivity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composeactivity.ui.theme.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@Composable
fun HelloText(message: String, fontSize: Float) {
    Text(text = message, fontSize = fontSize.sp, fontWeight = FontWeight.Bold)
}
@Composable
fun LoginButton() {
    Button(onClick = { /*TODO*/ }) {

    }
}

@Composable
fun CustomSwitch() {
    val checked = remember {
    mutableStateOf(true)
    }

    Column {
        Switch(checked = checked.value, onCheckedChange = { checked.value = it })
        if (checked.value) {
            Text("Switch is On")
        } else {
            Text("Switch is Off")
        }
    }

}

@Preview
@Composable
fun DemoTextPreview() {
    HelloText(message = "hi", fontSize = 12f)
    CustomSwitch()
}