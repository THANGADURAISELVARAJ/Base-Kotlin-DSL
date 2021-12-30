plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android")
}

android {
    compileSdk = AppConfigs.COMPILE_SDK

    defaultConfig {
        applicationId = AppConfigs.APPLICATION_ID
        minSdk = AppConfigs.MIN_SDK
        targetSdk = AppConfigs.TARGET_SDK
        versionCode = AppConfigs.VERSION_CODE
        versionName = AppConfigs.VERSION_NAME

        testInstrumentationRunner = AppConfigs.ANDROID_TEST_INSTRUMENTATION
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = AppConfigs.JVM_TARGET
    }

    buildFeatures {
        viewBinding = true
    }

    kapt {
        correctErrorTypes = true
    }

}

dependencies {

    /**
     * Core Dependencies
     * */
    implementation(LibraryDeps.LIST_OF_ANDROID_CORE_LIBRARIES)

    /**
     * Testing Dependencies
     * */
    testImplementation(TestDeps.LIST_OF_TEST_LIBRARIES)
    androidTestImplementation(TestDeps.LIST_OF_ANDROID_TEST_LIBRARIES)
}