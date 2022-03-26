object Dependencies {
    object Version {
        const val kotlin = "1.6.10"
        const val coroutines = "1.6.0"
        const val compose = "1.1.1"
        const val gradle = "7.1.2"
        const val espresso = "3.4.0"
        const val mockk = "1.12.3"
    }

    object Plugins {
        const val android = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    }

    object Android {
        const val core = "androidx.core:core-ktx:1.7.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
        const val material = "com.google.android.material:material:1.5.0"

    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Version.compose}"
        const val material = "androidx.compose.material:material:${Version.compose}"
        const val materialIcons = "androidx.compose.material:material-icons-extended:${Version.compose}"
        const val preview = "androidx.compose.ui:ui-tooling-preview:${Version.compose}"
        const val activityCompose = "androidx.activity:activity-compose:1.3.1"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"
        const val navigation = "androidx.navigation:navigation-compose:2.4.1"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitAndroidTest = "androidx.test.ext:junit:1.1.3"
        const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
        const val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
        const val espressoIdlingResource = "androidx.test.espresso:espresso-idling-resource:${Version.espresso}"
        const val mockk = "io.mockk:mockk:${Version.mockk}"
        const val mockkAndroid = "io.mockk:mockk-android:${Version.mockk}"
        const val turbine = "app.cash.turbine:turbine:0.6.1"
        const val wireMock = "com.github.tomakehurst:wiremock:2.26.3"
    }

    object Debug {
        const val preview = "androidx.compose.ui:ui-tooling:${Version.compose}"
    }

    const val kotlinDatetime = "org.jetbrains.kotlinx:kotlinx-datetime:0.3.2"
    const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"

    const val ktlint = "com.pinterest:ktlint:0.45.1"
}