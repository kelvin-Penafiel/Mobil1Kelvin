package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.ejemplo1.ui.theme.Ejemplo1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier =Modifier
            .background(Color.Red)
            .fillMaxSize(),
        //.size(400.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            //horizontalArrangement = Arrangement.SpaceBetween
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ){
            Text(
                text = "text1",
                color = Color.Green,
                fontSize = 20.sp,
                modifier = Modifier
                    //.fillMaxSize()
                    .size(80.dp)
            )
            Text(
                text = "text2",
                color = Color.Green,
                fontSize = 20.sp,
                modifier = Modifier
                    //.fillMaxSize()
                    .size(80.dp)
            )
        }
        Text(
            text = "Hello $name!",
            color = Color.Green,
            fontSize = 40.sp
        )
        Text(
            text = "Some other text",
            color = Color.Blue,
            fontSize = 40.sp
        )
    }

}

//Box( modifier = Modifier
//.size(400.dp)){
//   Text(text = "text1",
//       color = Color.Blue,
//       fontSize = 20.sp,
//    modifier = Modifier
//       .align(Alignment.BottomStart)

// )
//   Text(text = "text2",
// color = Color.Blue,
//  fontSize = 20.sp,
//    modifier = Modifier
//          .align(Alignment.TopEnd)
//
//  )
//}



//   Row(
//   verticalAlignment = Alignment.CenterVertically,
//      modifier = Modifier
//         .fillMaxSize()
//){
// Text(
//

//.fillMaxSize()
//   .size(80.dp)
//   )
// Text(
// text = "text2",
//  color = Color.Blue,
//  fontSize = 20.sp,
// modifier = Modifier
// .fillMaxSize()
//.size(80.dp)
//)
// }


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    Ejemplo1Theme {
        Greeting("samsung")
    }
}