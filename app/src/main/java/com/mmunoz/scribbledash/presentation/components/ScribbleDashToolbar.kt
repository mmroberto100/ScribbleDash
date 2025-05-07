@file:OptIn(ExperimentalMaterial3Api::class)

package com.mmunoz.scribbledash.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.presentation.designsystem.CloseCircleIcon
import com.mmunoz.scribbledash.presentation.designsystem.ScribbleDashTheme
import com.mmunoz.scribbledash.presentation.designsystem.bagelFatOne

@Composable
fun ScribbleDashToolbar(
    modifier: Modifier = Modifier,
    title: String = "",
    hideTitle: Boolean = false,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null
){
    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if(!hideTitle) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontFamily = bagelFatOne
                    )
                }
            }
        },
        actions = {
            endContent?.invoke()
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

@Preview(
    name = "Title Bar + End Content",
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
@Composable
private fun ToolbarEndContentPreview() {
    ScribbleDashTheme {
        ScribbleDashToolbar(
            title = "Scribble Dash",
            modifier = Modifier.fillMaxWidth(),
            endContent = {
                IconButton(
                    onClick = {  }
                ){
                    Icon(
                        modifier = Modifier
                            .width(40.dp),
                        imageVector = CloseCircleIcon,
                        contentDescription = "CloseIcon",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        )
    }
}