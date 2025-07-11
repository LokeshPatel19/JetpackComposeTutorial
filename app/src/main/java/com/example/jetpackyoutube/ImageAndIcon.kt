package com.example.jetpackyoutube

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ImageComposable(modifier: Modifier = Modifier) {

    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(20.dp)
            .shadow(
                elevation = 20.dp,
                shape = RoundedCornerShape(20.dp),
                spotColor = Color.White
            )
    ){
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Dummy",
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center,
            alpha = .5f,
            colorFilter = ColorFilter.tint(color = Color.Blue, BlendMode.Color)
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun IconComposable(modifier: Modifier = Modifier) {
    IconButton(
        onClick = {},
        colors = IconButtonDefaults.iconButtonColors().copy(
            containerColor = Color.Yellow
        )
    ) {
        Icon(
            imageVector = Icons.Sharp.Close,
            contentDescription = "icon",
            tint = Color.Blue
        )
    }
}