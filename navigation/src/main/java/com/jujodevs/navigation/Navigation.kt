package com.jujodevs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jujodevs.core.common.utils.NavRoute
import com.jujodevs.feature_a.navigation.featureANav
import com.jujodevs.feature_b.navigation.featureBNav

@Composable
fun Navigation(navHostController: NavHostController = rememberNavController(), startDestination: NavRoute) {
    NavHost(navController = navHostController, startDestination = startDestination) {
        featureANav(navHostController)
        featureBNav(navHostController)
    }
}
