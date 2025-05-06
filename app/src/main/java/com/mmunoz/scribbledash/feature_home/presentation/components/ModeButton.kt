package com.mmunoz.scribbledash.feature_home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.R
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme
import com.mmunoz.scribbledash.presentation.designsystem.successColor

@Composable
fun ModeButton (
    modifier: Modifier = Modifier
){
    Surface(
        modifier = modifier
            .padding(16.dp)
            .border(
                width = 8.dp,
                shape = RoundedCornerShape(20.dp),
                color = successColor
            )
            .wrapContentSize()
    ){
        Row(
            modifier = Modifier
                .height(IntrinsicSize.Max)

        ){
            Text(
                text = "One Round Wonder",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .align(alignment = CenterVertically)
                    .weight(1f)
                    .padding(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.one_round_wonder),
                contentDescription = "One Round Wonder",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()

            )
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun ModeItemPreview() {
    ScribbleDashTheme {
        ModeButton(
           
        )
    }
}