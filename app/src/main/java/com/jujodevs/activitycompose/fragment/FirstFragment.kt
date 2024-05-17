package com.jujodevs.activitycompose.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jujodevs.activitycompose.R
import com.jujodevs.activitycompose.databinding.FragmentFirstBinding
import com.jujodevs.compose.ComposeEntryFragment
import com.jujodevs.core.common.utils.NavRoute
import com.jujodevs.feature_a.routes.FeatureARoutes
import com.jujodevs.feature_b.routes.FeatureBRoutes

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUi()
    }

    private fun initUi() {
        setListeners()
    }

    private fun setListeners() {
        binding.btScreenA.setOnClickListener {
            navigate(FeatureARoutes.ScreenA("Fragment"))
        }
        binding.btScreenB.setOnClickListener {
            navigate(FeatureARoutes.ScreenB)
        }
        binding.btScreenC.setOnClickListener {
            navigate(FeatureARoutes.ScreenC)
        }
        binding.btScreenD.setOnClickListener {
            navigate(FeatureBRoutes.ScreenD)
        }
        binding.btScreenE.setOnClickListener {
            navigate(FeatureBRoutes.ScreenE)
        }
        binding.btScreenF.setOnClickListener {
            navigate(FeatureBRoutes.ScreenF)
        }
    }

    private fun navigate(destination: NavRoute) {
        ComposeEntryFragment.setRoute(destination)
        findNavController().navigate(R.id.action_FirstFragment_to_composeEntryFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}