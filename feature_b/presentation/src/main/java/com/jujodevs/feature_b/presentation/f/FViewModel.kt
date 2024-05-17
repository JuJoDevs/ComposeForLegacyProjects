package com.jujodevs.feature_b.presentation.f

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jujodevs.core.common.utils.UiEvent
import com.jujodevs.feature_a.routes.FeatureARoutes
import com.jujodevs.feature_b.routes.FeatureBRoutes
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class FViewModel: ViewModel() {

    private val _uiEvent = Channel<UiEvent>()
    val event = _uiEvent.receiveAsFlow()

    fun navigateToA() {
        viewModelScope.launch {
            _uiEvent.send(UiEvent.Navigate(FeatureARoutes.ScreenA("F")))
        }
    }
    fun navigateToB() {
        viewModelScope.launch {
            _uiEvent.send(UiEvent.Navigate(FeatureARoutes.ScreenB))
        }
    }
    fun navigateToC() {
        viewModelScope.launch {
            _uiEvent.send(UiEvent.Navigate(FeatureARoutes.ScreenC))
        }
    }
    fun navigateToD() {
        viewModelScope.launch {
            _uiEvent.send(UiEvent.Navigate(FeatureBRoutes.ScreenD))
        }
    }
    fun navigateToE() {
        viewModelScope.launch {
            _uiEvent.send(UiEvent.Navigate(FeatureBRoutes.ScreenE))
        }
    }

}