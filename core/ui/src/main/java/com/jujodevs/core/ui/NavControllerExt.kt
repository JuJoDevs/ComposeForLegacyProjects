package com.jujodevs.core.ui

import androidx.navigation.NavHostController
import com.jujodevs.core.common.utils.UiEvent

fun NavHostController.navigateEvent(event: UiEvent.Navigate) {
    navigate(event.route)
}
