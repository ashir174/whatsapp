package com.example.whatsapp.homescreen

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.bottomNavigation.bottomNavigation
import com.example.whatsapp.presentation.chat_box.ChatlistModel


@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {

    val chatData = listOf(ChatlistModel(
        R.drawable.salman_khan,
        name = "Salman Khan",
        msg = "Hi",
        time = "10:00 AM"
    ),

        ChatlistModel(
            R.drawable.sharukh_khan,
            name = "Sharukh Khan",
            msg = "Hello",
            time = "11:23 PM"
        ),

        ChatlistModel(
            R.drawable.mrbeast,
            name = "Mr Beast",
            msg = "Kidhar ha bhai? Baat sun....",
            time = "3:00 PM"
        ),

        ChatlistModel(
            R.drawable.atif_aslam,
            name =  "Atif Aslam",
            msg = "Chal 1 song ho jy",
            time = "11:09 PM"
        ),

        ChatlistModel(
            R.drawable.ali_zafar,
            name = "Ali Zafar",
            msg = "Hello bhai",
            time = "8:36 PM"
        ),

        ChatlistModel(
            R.drawable.ranveer_singh,
            name = "Ranveer Singh",
            msg = "Party at 2 AM :) ?",
            time = "4:57 PM"
        ),

        ChatlistModel(
            R.drawable.amir_khan,
            name = "Amir Khan",
            msg = "Time nahi......",
            time = "9:02 AM"
        ),

        ChatlistModel(
            R.drawable.trump,
            name = "Donald Trump",
            msg = "Noble Prize de b do saalo :)",
            time = "5:4 3 PM"
        ),
        ChatlistModel(
            R.drawable.thanos,
            name = "Thanos",
            msg = "Let me snap 1 more time:(",
            time = "6:12 AM"
        ),

        ChatlistModel(
            R.drawable.jokar,
            name = "Jokar",
            msg = "Boom!!!",
            time = "12:02 AM"
        ),

        ChatlistModel(
            R.drawable.rdj,
            name = "RDJ",
            msg = "I am Iron Man!!!",
            time = "2:23 PM"
        )
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                containerColor = colorResource(id = R.color.LightGreen),
                modifier = Modifier.size(65.dp),
                contentColor = colorResource(id = R.color.white)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),

                    )
            }
        },
        bottomBar = {
            bottomNavigation()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(1.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "WhatsApp",
                    color = colorResource(id = R.color.LightGreen),
                    fontSize = 28.sp,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold,
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

            }
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 0.dp),
                thickness = 2.dp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
            )

            LazyColumn() {
                items(chatData){
                    ChatDesign(chatlistModel = it)
                }
            }
        }
    }
}