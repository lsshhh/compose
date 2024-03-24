package com.example.composeactivity.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.R

@Composable
fun Kmong() {

    Column(
        Modifier
            .fillMaxSize()
            .background(White10),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "kmong", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "AlarmImage",
                modifier = Modifier.size(28.dp)
            )
        }
    }


}

@Composable
fun SearchView(onSearch: (String) -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue()) }
    var isSearching by remember { mutableStateOf(false) }

    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
            if (newText.text.isEmpty()) {
                isSearching = false
            }
        },
        modifier = Modifier
            .fillMaxWidth(),
        textStyle = TextStyle(color = Color.Black),
        placeholder = {
            Text(text = "Search")
        },
        leadingIcon = {
            Icon(Icons.Filled.Search, contentDescription = "Search")
        },
        trailingIcon = {
            if (isSearching) {
                IconButton(
                    onClick = {
                        text = TextFieldValue()
                        isSearching = false
                    }
                ) {
                    Icon(Icons.Filled.Clear, contentDescription = "Clear")
                }
            }
        },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(onSearch = {
            onSearch(text.text)
            isSearching = true
        })
    )
}

fun doSearch(query: String) {
    //Todo
    Log.e("search","$query")
}


@Preview
@Composable
fun DemoTextPreview() {
    Kmong()
}

