package com.example.whatsapp.presentation.userregisterationscreen

import androidx.collection.intIntMapOf
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun UserRegisterationScreen() {

    var expanded by remember {
        mutableStateOf(false)
    }

    var selectedCountry by remember {
        mutableStateOf("Pakistan")
    }

    var countryCode by remember {
        mutableStateOf("+92")
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
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
        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCountry,
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.align(
                        Alignment.CenterEnd
                    ),
                    tint = colorResource(id = R.color.LightGreen)
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = colorResource(id = R.color.LightGreen)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            listOf("Pakistan", "Japan", "India", "Iran", "USA").forEach { country ->
                DropdownMenuItem(text = { Text(text = country) }, onClick = {
                    selectedCountry = country
                    expanded = false
                })
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row {
                TextField(
                    value = countryCode,
                    onValueChange = { countryCode = it },
                    modifier = Modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(id = R.color.LightGreen),
                        focusedIndicatorColor = colorResource(id = R.color.LightGreen)
                    )
                )

                Spacer(modifier = Modifier.width(6.dp))

                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    placeholder = { Text(text = "Phone Number") },
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(id = R.color.LightGreen),
                        focusedIndicatorColor = colorResource(id = R.color.LightGreen)
                    )
                )


            }
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Carrier charges may apply",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.DarkGreen))
            ) {
                Text(text = "Next", fontSize = 16.sp)
            }

        }
    }
}