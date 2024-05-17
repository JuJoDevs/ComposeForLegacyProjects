plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply(from = "$rootDir/base-module.gradle")
apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.jujodevs.feature_a.navigation"
}

dependencies {
    implementation(projects.core.common)
    implementation(projects.core.ui)
    implementation(projects.featureA.presentation)
    implementation(projects.featureA.routes)
    implementation(projects.featureB.routes)
}
