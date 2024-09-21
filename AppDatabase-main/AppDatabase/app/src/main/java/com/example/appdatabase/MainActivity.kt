package com.example.appdatabase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appdatabase.ui.theme.AppDatabaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppDatabaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(modifier : Modifier = Modifier) {
    var nome by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    Column {
        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(
                text = "App DataSource",
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.Black,
            )
        }
        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = "", onValueChange ={
                    newnome -> nome = newnome
            },
                label = { Text(text = "Nome")}
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = "", onValueChange ={
                    newidade -> Telegone = newTelefone
            },
                label = { Text(text = "Telefone")}
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        Row(modifier = Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = {

            },

                ) {
                Text(text = "Cadastrar")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        App()
    }
}