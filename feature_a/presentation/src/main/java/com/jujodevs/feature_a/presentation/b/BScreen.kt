package com.jujodevs.feature_a.presentation.b

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jujodevs.core.common.utils.UiEvent
import com.jujodevs.core.ui.SingleEventEffect
import org.koin.androidx.compose.koinViewModel

@Composable
fun BScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: BViewModel = koinViewModel(),
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
        Text(text = "B Screen")
        Button(onClick = { viewModel.navigateToA() }) {
            Text(text = "Go to Screen A")
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
        Button(onClick = { viewModel.navigateToF() }) {
            Text(text = "Go to Screen F")
        }
    }
}
