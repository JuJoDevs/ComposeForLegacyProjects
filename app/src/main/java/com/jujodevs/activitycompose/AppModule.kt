package com.jujodevs.activitycompose

import android.app.Application
import com.jujodevs.feature_a.presentation.FeatureAPresentationModule
import com.jujodevs.feature_a.routes.FeatureARoutes
import com.jujodevs.feature_b.presentation.FeatureBPresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.logger.PrintLogger
import org.koin.ksp.generated.module

@Module
@ComponentScan
class AppModule {
}

fun Application.initDI() {
    startKoin {
        logger(PrintLogger(Level.DEBUG))
        androidContext(this@initDI)
        modules(
            AppModule().module,
            FeatureAPresentationModule().module,
            FeatureBPresentationModule().module,
        )
    }
}
