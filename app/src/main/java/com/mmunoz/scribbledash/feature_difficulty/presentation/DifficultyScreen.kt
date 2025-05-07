package com.mmunoz.scribbledash.feature_difficulty.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.feature_difficulty.domain.Level
import com.mmunoz.scribbledash.feature_difficulty.presentation.components.LevelButton
import com.mmunoz.scribbledash.presentation.components.ScribbleDashToolbar
import com.mmunoz.scribbledash.presentation.components.ScribbleScaffold
import com.mmunoz.scribbledash.presentation.designsystem.CloseCircleIcon
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme

@Composable
fun DifficultyScreen (
    modifier: Modifier = Modifier
){
    ScribbleScaffold(
        modifier = modifier,
        withGradientBackground = false,
        topAppBar = {
            ScribbleDashToolbar(
                hideTitle = true,
                endContent = {
                    Icon(
                        modifier = Modifier
                            .width(40.dp),
                        imageVector = CloseCircleIcon,
                        contentDescription = "CloseIcon",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            )
        }
    ){
        Spacer(modifier = modifier.height(48.dp))
        Text(
            text = "Start Drawing!",
            style = MaterialTheme.typography.displayMedium
        )
        Spacer(modifier = modifier.height(4.dp))
        Text(
            text = "Choose a difficulty setting",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = modifier.height(64.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.SpaceEvenly
        ) {
            LevelButton(
                level = Level.BEGINNER,
                modifier = Modifier
                    .padding(top = 24.dp)
            )
            LevelButton(level = Level.CHALLENGING)
            LevelButton(
                level = Level.MASTER,
                modifier = Modifier
                    .padding(top = 24.dp))
        }


    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF,
    showSystemUi = true
)
@Composable
private fun DifficultyScreenPreview() {
    ScribbleDashTheme {
        DifficultyScreen(
           
        )
    }
}