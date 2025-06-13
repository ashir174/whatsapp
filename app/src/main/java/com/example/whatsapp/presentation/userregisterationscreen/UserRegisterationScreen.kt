package com.example.whatsapp.presentation.userregisterationscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun UserRegisterationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter your Phone Number",
            fontSize = 20.sp,
            color = colorResource(id = R.color.DarkGreen),
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row {
            Text(text = "WhatsApp will need to verify your phone number.")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "What's", color = colorResource(id = R.color.DarkGreen))
        }
        Text(text = "my number?", color = colorResource(id = R.color.DarkGreen))
    }
}