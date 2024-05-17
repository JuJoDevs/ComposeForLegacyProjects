package com.jujodevs.feature_b.routes

import com.jujodevs.core.common.utils.NavRoute
import kotlinx.serialization.Serializable

sealed class FeatureBRoutes: NavRoute {
    @Serializable
    object ScreenD : NavRoute

    @Serializable
    object ScreenE : NavRoute

    @Serializable
    object ScreenF : NavRoute
}