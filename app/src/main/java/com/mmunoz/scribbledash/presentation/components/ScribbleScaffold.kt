package com.mmunoz.scribbledash.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ScribbleScaffold(
    modifier: Modifier = Modifier,
    withGradientBackground: Boolean = true,
    topAppBar: @Composable () -> Unit = {},
    navigationBar: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = topAppBar,
        bottomBar = navigationBar,
        modifier = modifier
    ) { padding ->
        if(withGradientBackground){
            GradientBackground(
                modifier = modifier
                    .padding(padding)
                    .consumeWindowInsets(padding)
            ){
                content(padding)
            }
        } else {
            content(padding)
        }
    }
}
