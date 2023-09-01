pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "kommander", "koncurrent", "kase"
).forEach { includeBuild("../$it") }

rootProject.name = "epsilon"

includeSubs("epsilon", ".", "core", "fake", "file")
includeSubs("epsilon-network", "network", "ktor")
