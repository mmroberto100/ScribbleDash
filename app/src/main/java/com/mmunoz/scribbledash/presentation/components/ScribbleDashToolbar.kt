@file:OptIn(ExperimentalMaterial3Api::class)

package com.mmunoz.scribbledash.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme
import com.mmunoz.scribbledash.presentation.designsystem.bagelFatOne

@Composable
fun ScribbleDashToolbar(
    title: String,
    modifier: Modifier = Modifier,
    startContent: (@Composable () -> Unit)? = null
){
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = bagelFatOne
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        )
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
@Composable
private fun ToolbarPreview() {
    ScribbleDashTheme {
        ScribbleDashToolbar(
            title = "Scribble Dash",
            modifier = Modifier.fillMaxWidth()
        )
    }
}