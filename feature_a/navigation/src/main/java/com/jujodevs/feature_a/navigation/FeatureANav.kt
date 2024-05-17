package com.jujodevs.feature_a.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jujodevs.core.ui.navigateEvent
import com.jujodevs.feature_a.presentation.a.AScreen
import com.jujodevs.feature_a.presentation.b.BScreen
import com.jujodevs.feature_a.presentation.c.CScreen
import com.jujodevs.feature_a.routes.FeatureARoutes

fun NavGraphBuilder.featureANav(navController: NavHostController) {
    composable<FeatureARoutes.ScreenA> {
        AScreen(onNavigate = navController::navigateEvent)
    }
    composable<FeatureARoutes.ScreenB> {
        BScreen(onNavigate = navController::navigateEvent)
    }
    composable<FeatureARoutes.ScreenC> {
        CScreen(onNavigate = navController::navigateEvent)
    }
}
