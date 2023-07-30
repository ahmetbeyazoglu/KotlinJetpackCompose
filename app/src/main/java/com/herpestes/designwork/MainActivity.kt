package com.herpestes.designwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    /* Box{
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
    }*/
    /*  Box{
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
            Box(modifier = Modifier
                .size(80.dp)
                .background(Color.Red))
            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.Green))
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Blue))
        }
    }
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()){
            Box(modifier = Modifier
                .size(80.dp)
                .background(Color.Red))
            Box(modifier = Modifier
                .size(50.dp)
                .background(Color.Green))
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Blue))
        }*/
    /*Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }*/
    /*Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }*/

    /*Box(modifier = Modifier
        .size(200.dp)
        .background(Color.Red)){
        Text(text = "Merhaba", modifier = Modifier.align(Alignment.BottomCenter))
    }*/

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally){
        
        Text(text = stringResource(id = R.string.textyazi), fontSize = 50.sp)
        Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(id = R.string.buttonyazi), fontSize = 24.sp)
        }

    }



}

@Preview(showBackground = true, locale = "tr")
@Composable
fun DefaultPreview() {
    DesignWorkTheme {
        Sayfa()
    }
}