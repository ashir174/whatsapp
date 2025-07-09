package com.example.whatsapp.presentation.statusScreen

import com.example.whatsapp.R
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showSystemUi = true)
fun topBar() {
    Column {
        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            // Left side: "Status"
            Text(
                text = "Status",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = colorResource(id = R.color.LightGreen)
            )

            // Right side: Icon buttons in a nested Row
            Row {
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
            modifier = Modifier.padding(horizontal = 12.dp),
            thickness = 2.dp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.1f)
        )
    }
}
