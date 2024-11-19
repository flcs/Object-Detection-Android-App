plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.surendramaran.yolov8tflite"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.surendramaran.yolov8tflite"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val cameraxVersion = "1.4.0-alpha03"
    implementation("androidx.camera:camera-camera2:${cameraxVersion}")
    implementation("androidx.camera:camera-lifecycle:${cameraxVersion}")
    implementation("androidx.camera:camera-view:${cameraxVersion}")

    implementation("org.tensorflow:tensorflow-lite:2.14.0")
    implementation("org.tensorflow:tensorflow-lite-support:0.4.4")
    
    // adicionando alterações
    
    val kotlin_version = "1.5.31"

    // implementation('androidx.core:core-ktx:1.7.0')
    // implementation('com.android.support:appcompat-v7:28.0.0')
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")
    
    
    // implementation('androidx.appcompat:appcompat:1.4.0')
    // implementation('com.google.android.material:material:1.5.0')
    // implementation('androidx.constraintlayout:constraintlayout:2.1.2')
    // implementation('androidx.camera:camera-core:1.1.0-beta01')
    // implementation('androidx.camera:camera-camera2:1.1.0-beta01')
    // implementation('androidx.camera:camera-lifecycle:1.1.0-beta01')
    // implementation('androidx.camera:camera-view:1.0.0-alpha31')
    // implementation('androidx.activity:activity-ktx:1.2.0')
    // testImplementation("junit:junit:4.13.2")
    
    // androidTestImplementation('androidx.test.ext:junit:1.1.2')
    // androidTestImplementation('androidx.test.espresso:espresso-core:3.3.0')    
    
}