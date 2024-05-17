package com.jujodevs.activitycompose

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jujodevs.activitycompose.databinding.ActivityMainBinding
import com.jujodevs.activitycompose.fragment.FragmentActivity
import com.jujodevs.compose.ComposeEntryActivity
import com.jujodevs.core.common.utils.NavRoute
import com.jujodevs.feature_a.routes.FeatureARoutes
import com.jujodevs.feature_b.routes.FeatureBRoutes

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initUI()
    }

    private fun initUI() {
        setListeners()
    }

    private fun setListeners() {
        with(binding) {
            btFragment.setOnClickListener {
                startActivity(FragmentActivity.create(this@MainActivity))
            }
            btScreenA.setOnClickListener {
                startComposeEntryActivity(FeatureARoutes.ScreenA("Activity"))
            }
            btScreenB.setOnClickListener {
                startComposeEntryActivity(FeatureARoutes.ScreenB)
            }
            btScreenC.setOnClickListener {
                startComposeEntryActivity(FeatureARoutes.ScreenC)
            }
            btScreenD.setOnClickListener {
                startComposeEntryActivity(FeatureBRoutes.ScreenD)
            }
            btScreenE.setOnClickListener {
                startComposeEntryActivity(FeatureBRoutes.ScreenE)
            }
            btScreenF.setOnClickListener {
                startComposeEntryActivity(FeatureBRoutes.ScreenF)
            }
        }
    }

    private fun startComposeEntryActivity(route: NavRoute) {
        startActivity(ComposeEntryActivity.create(this, route))
    }
}