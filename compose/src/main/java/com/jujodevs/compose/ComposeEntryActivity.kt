package com.jujodevs.compose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jujodevs.core.common.utils.NavRoute
import com.jujodevs.core.ui.theme.ComposeTheme
import com.jujodevs.navigation.Navigation

class ComposeEntryActivity: ComponentActivity() {

    companion object {
        private lateinit var destination: NavRoute

        fun create(context: Context, destination: NavRoute): Intent {
            this.destination = destination
            return Intent(context, ComposeEntryActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTheme {
                Navigation(startDestination = destination)
            }
        }
    }
}