package com.jujodevs.core.common.utils

import kotlinx.serialization.Serializable

sealed interface UiEvent {
    data class Navigate(val route: NavRoute) : UiEvent
    data object NavigateUp : UiEvent
    data object Idle: UiEvent
}