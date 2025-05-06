package com.mmunoz.scribbledash.presentation.components

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.indicatorColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mmunoz.scribbledash.presentation.designsystem.ChartIcon
import com.mmunoz.scribbledash.presentation.designsystem.HomeIcon
import com.mmunoz.scribbledash.presentation.designsystem.primaryColor
import com.mmunoz.scribbledash.presentation.designsystem.surfaceColor
import com.mmunoz.scribbledash.presentation.designsystem.surfaceLowestColor

@Composable
fun ScribbleNavigationBar (
    modifier: Modifier = Modifier
){
    NavigationBar(
        containerColor = surfaceColor
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {

            },
            label = {
                Text(text = "Chart")
            },
            alwaysShowLabel = false,
            icon = {
                Icon(
                    imageVector = ChartIcon,
                    contentDescription = "Chart"
                )
            },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = primaryColor,
                unselectedIconColor = surfaceLowestColor,
                indicatorColor = surfaceColor
            )
        )
        NavigationBarItem(
            selected = true,
            onClick = {

            },
            label = {

            },
            alwaysShowLabel = false,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = primaryColor,
                unselectedIconColor = surfaceLowestColor,
                indicatorColor = surfaceColor
            ),
            icon = {
                Icon(
                    imageVector = HomeIcon,
                    contentDescription = "Home"
                )
            }

        )
    }
}