plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs")
    id("kotlin-kapt")
}

android {
    namespace = "com.kokov.workavista"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kokov.workavista"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    val coreKtxVersion = "1.12.0"
    val appcompatVersion = "1.6.1"
    val materialVersion = "1.10.0"
    val constraintlayoutVersion = "2.1.4"
    val recyclerview_version = "1.3.2"
    val lifecycle_version = "2.6.2"

    val nav_version = "2.7.6"

    val circleimageviewVersion = "3.1.0"

    val junitVersion = "4.13.2"
    val extJunitVersion = "1.1.5"
    val espressoCoreVersion = "3.5.1"



    implementation("androidx.core:core-ktx:$coreKtxVersion")
    implementation("androidx.appcompat:appcompat:$appcompatVersion")
    implementation("com.google.android.material:material:$materialVersion")
    implementation("androidx.constraintlayout:constraintlayout:$constraintlayoutVersion")
    implementation("androidx.recyclerview:recyclerview:$recyclerview_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    implementation("de.hdodenhof:circleimageview:$circleimageviewVersion")

    testImplementation("junit:junit:$junitVersion")
    androidTestImplementation("androidx.test.ext:junit:$extJunitVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoCoreVersion")
}