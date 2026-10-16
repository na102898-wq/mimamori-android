plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}
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
