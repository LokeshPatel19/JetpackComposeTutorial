package com.example.jetpackyoutube

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun TextFieldCompose() {

    var tfText by remember {
        mutableStateOf("")
    }

    val passwordVisible by remember {
        mutableStateOf(false)
    }

    TextField(
        value = tfText,
        onValueChange = {
            tfText = it
        },
        modifier = Modifier.padding(30.dp),
        label = {
            Text(
                text = "Email"
            )
        },
        placeholder = {
            Text(
                text = "Email here"
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email"
            )
        },
        trailingIcon = {

            IconButton(
                onClick = {
                    passwordVisible != passwordVisible
                }
            ) {
                Icon(
                    imageVector =
                        if (!passwordVisible){
                            ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground)
                        }
                    else{
                        ImageVector.vectorResource(id = R.drawable.ic_launcher_background)
                        },
                    contentDescription = "password"
                )
            }
        },
        prefix = {
            Text(
                text = "Pre"
            )
        },
        suffix = {
            Text(
                text = "suf"
            )
        },
        supportingText = {
            Text(
                text = "This is a Supporting Text !!"
            )
        },

        visualTransformation = if (!passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(
            KeyboardCapitalization.Words,
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Search
        ),

        keyboardActions = KeyboardActions(
            onSearch = {
                Log.d("OnSearch", "OnSearch")
            }
        ),
        shape = RoundedCornerShape(20.dp)
    )
}