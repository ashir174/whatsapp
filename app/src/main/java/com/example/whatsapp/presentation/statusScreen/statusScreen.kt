package com.example.whatsapp.presentation.statusScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.bottomNavigation.bottomNavigation

@Composable
@Preview(showSystemUi = true)
fun statusScreen() {
    Scaffold(
        topBar = {
            topBar()
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.LightGreen),
                modifier = Modifier.size(56.dp),
                contentColor = Color.White
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
        },
        bottomBar = {
            bottomNavigation()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
        }
    }
}
