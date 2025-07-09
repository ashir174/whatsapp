package com.example.whatsapp.presentation.bottomNavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R


@Composable
@Preview(showSystemUi = true)
fun bottomNavigation() {
    BottomAppBar(tonalElevation = 12.dp, containerColor = Color.White) {
        Row(modifier = Modifier.fillMaxWidth().padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Chats", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.update_icon),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                )

                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Status", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.communities_icon),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                )

                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Communities", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp),
                )

                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Call", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }
    }
}