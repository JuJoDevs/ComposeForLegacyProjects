package com.jujodevs.compose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.jujodevs.core.common.utils.NavRoute
import com.jujodevs.core.ui.theme.ComposeTheme
import com.jujodevs.navigation.Navigation

class ComposeEntryFragment: Fragment() {

    private val mDestination: NavRoute? = destination

    companion object {
        private var destination: NavRoute? = null

        fun setRoute(destination: NavRoute) {
            this.destination = destination
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeTheme {
                    mDestination?.let {
                        Navigation(startDestination = mDestination)
                    }
                }
            }
        }
    }
}