package com.mmunoz.scribbledash.feature_home.presentation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.feature_home.presentation.components.ModeButton
import com.mmunoz.scribbledash.presentation.components.ScribbleDashToolbar
import com.mmunoz.scribbledash.presentation.components.ScribbleNavigationBar
import com.mmunoz.scribbledash.presentation.components.ScribbleScaffold
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme

@Composable
fun HomeScreen (
    modifier: Modifier = Modifier
){
    ScribbleScaffold(
        modifier = modifier,
        topAppBar = {
            ScribbleDashToolbar(
                title = "Scribble Dash"
            )
        },
        navigationBar = {
            ScribbleNavigationBar()
        }
    ) {
        Spacer(modifier = modifier.height(48.dp))
        Text(
            text = "Start Drawing!",
            style = MaterialTheme.typography.displayMedium
        )
        Spacer(modifier = modifier.height(4.dp))
        Text(
            text = "Select game mode",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = modifier.height(16.dp))
        ModeButton()
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF,
    showSystemUi = true
)


@Composable
private fun HomeScreenPreview() {
    ScribbleDashTheme {
        HomeScreen(
           
        )
    }
}