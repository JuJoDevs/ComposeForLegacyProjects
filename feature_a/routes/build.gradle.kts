plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.jujodevs.feature_a.routes"
}

dependencies {
    implementation(projects.core.common)
}
