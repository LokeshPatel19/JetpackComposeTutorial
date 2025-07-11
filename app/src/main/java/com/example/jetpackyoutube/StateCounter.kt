package com.example.jetpackyoutube

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun CounterApp(modifier: Modifier = Modifier) {

    var count by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ){
        Column {
            Text(
                text = "Counter App",
                modifier = Modifier
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Italic,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    shadow = Shadow(
                        color = Color.Yellow,
                        blurRadius = 20f
                    )
                )
            )

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = count.toString(),
                modifier = Modifier
                    .fillMaxWidth(),
                style = TextStyle(
                    fontSize = 50.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    shadow = Shadow(
                        color = Color.Yellow,
                        blurRadius = 20f
                    )
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    count++
                },
                modifier = Modifier.padding(10.dp).align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
                colors = ButtonDefaults.buttonColors().copy(
                    containerColor = Color.Blue,
                    contentColor = Color.Yellow
                ),
                border = BorderStroke(
                    3.dp,
                    brush = Brush.linearGradient(
                        listOf(
                            Color.Magenta,
                            Color.Green,
                            Color.Red,
                            Color.Yellow
                        )
                    )
                ),
                contentPadding = PaddingValues(horizontal = 45.dp, vertical = 15.dp)
            ) {
                Text(
                    text = "Count !!"
                )
            }
        }
    }
}