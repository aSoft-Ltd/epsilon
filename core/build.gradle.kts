plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
}

kotlin {
    if (Targeting.JVM) jvm { library() }
    if (Targeting.JS) js(IR) { library(testTimeout = 10000) }
//    if (Targeting.WASM) wasm { library() }
    val osxTargets = if (Targeting.OSX) osxTargets() else listOf()
//    val ndkTargets = if (Targeting.NDK) ndkTargets() else listOf()
    val linuxTargets = if (Targeting.LINUX) linuxTargets() else listOf()
//    val mingwTargets = if (Targeting.MINGW) mingwTargets() else listOf()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(projects.koncurrentLaterCoroutines)
            }
        }

        val commonTest by getting {
            dependencies {
                api(projects.koncurrentLaterTest)
                api(projects.kommanderCoroutines)
            }
        }
    }
}