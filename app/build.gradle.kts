plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "jp.mimamori.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "jp.mimamori.app"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
