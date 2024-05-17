package com.jujodevs.feature_a.routes

import com.jujodevs.core.common.utils.NavRoute
import kotlinx.serialization.Serializable

sealed class FeatureARoutes: NavRoute {
    @Serializable
    data class ScreenA(val name: String = "") : NavRoute

    @Serializable
    object ScreenB : NavRoute

    @Serializable
    object ScreenC : NavRoute
}