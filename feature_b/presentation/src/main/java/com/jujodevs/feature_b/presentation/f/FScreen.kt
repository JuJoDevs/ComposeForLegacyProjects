package com.jujodevs.feature_b.presentation.f

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jujodevs.core.common.utils.UiEvent
import com.jujodevs.core.ui.SingleEventEffect
import com.jujodevs.feature_b.presentation.d.DViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun FScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: FViewModel = koinViewModel(),
) {
    SingleEventEffect(sideEffectFlow = viewModel.event) { uiEvent ->
        when (uiEvent) {
            is UiEvent.Navigate -> onNavigate(uiEvent)
            else -> Unit
        }
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "F Screen")
        Button(onClick = { viewModel.navigateToA() }) {
            Text(text = "Go to Screen A")
        }
        Button(onClick = { viewModel.navigateToB() }) {
            Text(text = "Go to Screen B")
        }
        Button(onClick = { viewModel.navigateToC() }) {
            Text(text = "Go to Screen C")
        }
        Button(onClick = { viewModel.navigateToD() }) {
            Text(text = "Go to Screen D")
        }
        Button(onClick = { viewModel.navigateToE() }) {
            Text(text = "Go to Screen E")
        }
    }
}
