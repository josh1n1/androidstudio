package com.example.basicscodelab

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.ui.theme.BasicsCodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicsCodeLabTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(names: List<String> = listOf("World", "Compose")) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column (modifier = Modifier.padding(24.dp)){
            for (name in names) {
                Greeting(
                    name = name,
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }

    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(2.5.dp)
        ) {
        Row {
            Column(modifier = Modifier.padding(24.dp).weight(1f)){
                Text(
                    color = Color.White,
                    text = "Hello, "

                )
                Text(
                    color = Color.White,
                    text = "$name!"

                )
            }
            OutlinedButton(
                onClick = {},
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,  // Set the button background to white
                    contentColor = Color.Black     // Set the text color to black
                )
                ) {
                Text(
                    text = "Show more",
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicsCodeLabTheme {
        MyApp()
    }
}

