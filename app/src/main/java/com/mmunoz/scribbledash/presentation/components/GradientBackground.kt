package com.mmunoz.scribbledash.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme
import com.mmunoz.scribbledash.presentation.designsystem.backgroundGradient


@Composable
fun GradientBackground(
    modifier: Modifier = Modifier,
    hasToolbar: Boolean = false,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundGradient)
            .then(
                if (hasToolbar) {
                    Modifier
                } else {
                    Modifier.systemBarsPadding()
                }
            ),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        content()
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun GradientBackgroundPreview() {
    ScribbleDashTheme {
        GradientBackground(
            hasToolbar = true
        ){

        }

    }
}