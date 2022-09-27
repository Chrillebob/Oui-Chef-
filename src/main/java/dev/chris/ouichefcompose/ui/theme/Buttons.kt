package dev.chris.ouichefcompose.ui.theme

import android.widget.ImageButton
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit,

) {
    Button(
        modifier = Modifier
            .width(400.dp)
            .height(80.dp)
            .absolutePadding(50.dp, 15.dp, 50.dp, 0.dp),
             elevation = ButtonDefaults.elevation(8.dp)   ,

        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent

        ) ,
        contentPadding = PaddingValues(),

        onClick = { onClick() },
    )
    {
        Box(modifier = Modifier
            .fillMaxSize()


            .background(gradient),


            contentAlignment = Alignment.Center
        ) {
            Arrangement.SpaceEvenly


            Text(
                modifier = Modifier

                    .align(Alignment.Center),
                fontSize = 26.sp,
                text = text,
                color = textColor)
        }
    }

}







