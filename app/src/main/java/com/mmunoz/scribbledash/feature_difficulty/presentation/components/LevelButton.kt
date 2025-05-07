package com.mmunoz.scribbledash.feature_difficulty.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.R
import com.mmunoz.scribbledash.feature_difficulty.domain.Level
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme
import com.mmunoz.scribbledash.presentation.designsystem.onBackgroundVariantColor
import java.util.Locale

@Composable
fun LevelButton (
    level: Level = Level.BEGINNER,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
){
    Column(
        modifier = modifier
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = modifier
                .size(90.dp)
                .shadow(2.dp, CircleShape)
                .clip(CircleShape)
                .clickable{

                },
            shape = CircleShape
        ){
            Image(
                painter = painterResource(id =
                    when(level){
                        Level.BEGINNER -> R.drawable.level_beginner
                        Level.CHALLENGING -> R.drawable.level_challenging
                        Level.MASTER -> R.drawable.level_master
                    }
                ),
                contentDescription = capitalizeLevel(level),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text =  capitalizeLevel(level),
            style = MaterialTheme.typography.labelMedium,
            color = onBackgroundVariantColor
        )
    }
}

private fun capitalizeLevel(level: Level): String {
    return level.name.lowercase().replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(Locale.getDefault())
        else it.toString() }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFEFAF6
)
@Composable
private fun LevelButtonPreview(
    @PreviewParameter(LevelPreviewParameterProvider::class) level: Level
) {

    ScribbleDashTheme {
        LevelButton(
            level = level
        )
    }
}

class LevelPreviewParameterProvider : PreviewParameterProvider<Level> {
    override val values = sequenceOf(
        Level.BEGINNER,
        Level.CHALLENGING,
        Level.MASTER
    )
}