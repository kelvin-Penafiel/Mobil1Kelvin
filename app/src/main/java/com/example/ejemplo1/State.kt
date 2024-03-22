package com.example.ejemplo1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable 
fun TapCounter(){
    //var counter = mutableListOf(0)
    var counter = remember {
        mutableIntStateOf(0)
    }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.
            fillMaxSize()
        ){
            Text(
                text = counter.value.toString(),
                fontSize = 30.sp
            )
            Button(onClick={
                //println("Button Tapped")
                //counter = counter +1
                counter.value ++

            }){
                Icon(
                    imageVector = Icons.Default.Build,
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Spacer(
                    modifier = Modifier.size(15.dp)
                )
                Text(text = "Tap me!")
            }

                Button(onClick={
                    //println("Button Tapped")
                    //counter = counter +1
                    counter.value ++

                }){
                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(
                    modifier = Modifier.size(18.dp)
                )
                Text(text = "Reinicia"
                       )
                }

        }
}

@Preview(showBackground = true)
@Composable
fun TapPrevieww(){
    TapCounter()
}
    