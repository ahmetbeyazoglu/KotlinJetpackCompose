package com.herpestes.designwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.herpestes.designwork.ui.theme.DesignWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
  /*  Row{
        Text(text = "Merhaba")
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Blue))
    }
    Column{
        Text(text = "Merhaba")
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Blue))
    }
    Box{
        Text(text = "Merhaba")
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Blue))
    }*/

    Box{
        Box(modifier = Modifier
            .size(400.dp)
            .background(Color.Black))
    Column {
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Green))
        Row {
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Blue))
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow))
            
        }
        
    }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DesignWorkTheme {
        Sayfa()
    }
}