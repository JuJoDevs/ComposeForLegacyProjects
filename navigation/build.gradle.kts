plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply(from = "$rootDir/base-module.gradle")
apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.jujodevs.navigation"
}

dependencies {
    implementation(projects.core.common)
    implementation(projects.core.ui)
    api(projects.featureA.navigation)
    api(projects.featureB.navigation)
}
