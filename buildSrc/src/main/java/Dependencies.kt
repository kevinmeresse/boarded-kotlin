/**
 * A holder of all the versions.
 */
object Versions {

    // Build Config
    const val minSDK = 16
    const val compileSDK = 27
    const val targetSDK = 27
    const val buildTools = "27.0.3"

    // App version
    const val versionCode = 1
    const val versionName = "1.0"

    // Plugins
    const val androidGradlePlugin = "3.0.1"

    // Dependencies
    const val kotlin = "1.2.30"
    const val support = "27.1.0"
    const val constraintLayout = "1.0.2"
    const val lifecycle = "1.1.0"
    const val room = "1.0.0"
    const val retrofit = "2.3.0"
    const val gson = "2.8.2"
    const val okHttp = "3.10.0"
    const val fresco = "1.8.1"

    // Testing
    const val junit = "4.12"
    const val espresso = "3.0.1"
    const val runner = "1.0.1"
}

/**
 * A holder of all the dependencies required by the app.
 */
object Libs {

    // Android Gradle Plugin
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Support Library
    const val supportV4 = "com.android.support:support-v4:${Versions.support}"
    const val appCompatV7 = "com.android.support:appcompat-v7:${Versions.support}"
    const val cardview = "com.android.support:cardview-v7:${Versions.support}"
    const val design = "com.android.support:design:${Versions.support}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"

    // Data Binding
    const val dataBinding = "com.android.databinding:compiler:${Versions.androidGradlePlugin}"

    // Architecture Components
    const val lifecycle = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"
    const val coreTesting = "android.arch.core:core-testing:${Versions.lifecycle}"
    const val room = "android.arch.persistence.room:runtime:${Versions.room}"
    const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.room}"
    const val roomTesting = "android.arch.persistence.room:testing:${Versions.room}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"

    // Images
    const val fresco = "com.facebook.fresco:fresco:${Versions.fresco}"

    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val runner = "com.android.support.test:runner:${Versions.runner}"
}
