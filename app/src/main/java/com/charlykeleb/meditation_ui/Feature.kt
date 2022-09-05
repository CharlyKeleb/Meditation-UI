package com.charlykeleb.meditation_ui

import androidx.compose.ui.graphics.Color
import androidx.annotation.DrawableRes

data class Feature(
    val title: String,
    @DrawableRes val IconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
)
