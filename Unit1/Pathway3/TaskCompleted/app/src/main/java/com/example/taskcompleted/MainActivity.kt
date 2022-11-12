package com.example.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcompleted.ui.theme.TaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedTheme {
                Surface(color = MaterialTheme.colors.background) {
                    TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    val imagePainter: Painter = painterResource(id = R.drawable.ic_task_completed)
    val title: String = stringResource(id = R.string.all_task_completed)
    val subString: String = stringResource(id = R.string.nice_work)

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
        )
        Text(
            text = subString,
            fontSize = 16.sp,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskCompletedScreen()
}