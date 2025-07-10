package com.example.jetpackyoutube

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun Basic(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello Lokesh",
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .alpha(.3f),
            color = colorResource(R.color.purple_700),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            letterSpacing = 10.sp,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center
        )

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