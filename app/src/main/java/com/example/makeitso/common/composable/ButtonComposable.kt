package com.example.makeitso.common.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.makeitso.theme.BrightOrange

@Composable
fun BasicTextButton(@StringRes text: Int, action: () -> Unit) {
    TextButton(
        onClick = action,
        modifier = Modifier.fillMaxWidth().padding(16.dp, 8.dp, 16.dp, 0.dp)
    ) {
        Text(text = stringResource(text), color = Color.Gray)
    }
}

@Composable
fun BasicButton(@StringRes text: Int, action: () -> Unit) {
    Button(
        onClick = action,
        modifier = Modifier.fillMaxWidth().padding(16.dp, 8.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = BrightOrange,
            contentColor = Color.White
        )
    ) {
        Text(text = stringResource(text), fontSize = 16.sp)
    }
}

@Composable
fun DialogButton(@StringRes text: Int, action: () -> Unit) {
    Button(
        onClick = action,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = BrightOrange,
            contentColor = Color.White
        )
    ) {
        Text(text = stringResource(text))
    }
}
