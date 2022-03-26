plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val ktlint: Configuration by configurations.creating

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "net.nevardreik.jetpackcomposebase"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.Android.core)
    implementation(Dependencies.Android.lifecycle)

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.viewModel)
    implementation(Dependencies.Compose.navigation)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.materialIcons)
    implementation(Dependencies.Compose.preview)
    implementation(Dependencies.Compose.activityCompose)

    implementation(Dependencies.Coroutines.core)
    implementation(Dependencies.Coroutines.android)

    implementation(Dependencies.kotlinDatetime)
    implementation(Dependencies.kotlinSerializationJson)

    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.mockk)
    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.turbine)
    testImplementation(Dependencies.Test.wireMock)

    androidTestImplementation(Dependencies.Test.junitAndroidTest)
    androidTestImplementation(Dependencies.Test.composeUiTest)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.espressoIdlingResource)
    androidTestImplementation(Dependencies.Test.mockkAndroid)

    debugImplementation(Dependencies.Debug.preview)

	ktlint(Dependencies.ktlint) {
		attributes {
			attribute(Bundling.BUNDLING_ATTRIBUTE, objects.named(Bundling.EXTERNAL))
		}
	}
}

val ktlintOutputDir = "${project.buildDir}/reports/ktlint/"
val ktlintInputDir = project.fileTree(mapOf("dir" to "src", "include" to "**/*.kt"))

val ktlintCheck by tasks.creating(JavaExec::class) {
	inputs.files(ktlintInputDir)
	outputs.dir(ktlintOutputDir)
	group = "quality"

	description = "Check Kotlin code style."
	classpath = ktlint
	mainClass.set("com.pinterest.ktlint.Main")
	args = listOf("src/**/*.kt")
}

val ktlintFormat by tasks.creating(JavaExec::class) {
	inputs.files(ktlintInputDir)
	outputs.dir(ktlintOutputDir)
	group = "quality"

	description = "Fix Kotlin code style deviations."
	classpath = ktlint
	mainClass.set("com.pinterest.ktlint.Main")
	args = listOf("-F", "src/**/*.kt")
}