plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply(from = "$rootDir/base-module.gradle")
apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.jujodevs.feature_b.navigation"
}

dependencies {
    implementation(projects.core.common)
    implementation(projects.core.ui)
    implementation(projects.featureB.presentation)
    implementation(projects.featureB.routes)
    implementation(projects.featureA.routes)
}
