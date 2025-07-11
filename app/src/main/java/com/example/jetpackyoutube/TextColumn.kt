package com.example.jetpackyoutube

import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Preview(showSystemUi = true)
@Composable
fun TextColumn(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(40.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(40.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(40.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun TextRow(modifier: Modifier = Modifier) {
    Row (
        modifier = Modifier
            .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        Button(
            onClick = {},
            modifier = Modifier
                .wrapContentSize(),
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(20.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }

        Button(
            onClick = {},
            modifier = Modifier,
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(20.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }

        Button(
            onClick = {},
            modifier = Modifier,
            shape = RoundedCornerShape(topEnd = 10.dp, bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors().copy(
                contentColor = Color.Yellow,
                containerColor = Color.Blue
            ),
            border = BorderStroke(1.dp, brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red, Color.Yellow))),
            contentPadding = PaddingValues(20.dp)
        ) {
            Text(
                text = "Click Here !!"
            )
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun BoxFunction(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ){
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ){
                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.LightGray)
                )

                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.Red)
                        .align(Alignment.TopStart)
                )

                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.Yellow)
                        .align(Alignment.TopEnd)
                )

                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.Blue)
                        .align(Alignment.BottomStart)                )

                Box(
                    modifier = Modifier
                        .size(130.dp)
                        .padding(20.dp)
                        .clip(RoundedCornerShape(30.dp))
                        .background(Color.Green)
                        .align(Alignment.BottomEnd)
                )
            }
        }
        Text(
            text = "Hello Lokesh !!",
            color = colorResource(R.color.black),
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun SurfaceFunction(modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(200.dp)
            .shadow(15.dp, spotColor = Color.Green,
                shape = RoundedCornerShape(15.dp)
            ),
        color = Color.White,
        shadowElevation = 10.dp,
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.Yellow)
    ){
        Box (
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Lokesh is here !!",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = Color.Red,
                        blurRadius = 15f
                    )
                )
            )
        }
    }
}




@Preview(showSystemUi = true)
@Composable
fun CardFunction(modifier: Modifier = Modifier) {

    Card(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .height(200.dp)
            .shadow(15.dp, spotColor = Color.Green,
                shape = RoundedCornerShape(15.dp)
            ),
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(1.dp, Color.Yellow)
    ){
        Box (
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Lokesh is here !!",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    shadow = Shadow(
                        color = Color.Red,
                        blurRadius = 15f
                    )
                )
            )
        }
    }
}