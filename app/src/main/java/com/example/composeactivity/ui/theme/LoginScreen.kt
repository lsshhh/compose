package com.example.composeactivity.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.R


@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "LoginImage",
            modifier = Modifier.size(200.dp)
        )
        Text(text = "Welcome to Compose", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "welcome to your account")
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "PassWord")
        })
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}) {
            Text(text = "Login")
        }
        TextButton(onClick = {}) {
            Text(text = "Forgot password?")
        }
        // same
        Text(text = "Forgot password?", Modifier.clickable {  })

    }
}

@Preview
@Composable
fun DemoTextPreview() {
    LoginScreen()
}