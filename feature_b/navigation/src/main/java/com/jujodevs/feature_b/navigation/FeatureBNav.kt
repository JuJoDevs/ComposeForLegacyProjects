package com.jujodevs.feature_b.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jujodevs.core.ui.navigateEvent
import com.jujodevs.feature_b.presentation.d.DScreen
import com.jujodevs.feature_b.presentation.e.EScreen
import com.jujodevs.feature_b.presentation.f.FScreen
import com.jujodevs.feature_b.routes.FeatureBRoutes

fun NavGraphBuilder.featureBNav(navController: NavHostController) {
    composable<FeatureBRoutes.ScreenD> {
        DScreen(onNavigate = navController::navigateEvent)
    }
    composable<FeatureBRoutes.ScreenE> {
        EScreen(onNavigate = navController::navigateEvent)
    }
    composable<FeatureBRoutes.ScreenF> {
        FScreen(onNavigate = navController::navigateEvent)
    }
}
