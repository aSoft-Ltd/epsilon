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
    "kommander", "koncurrent", "kase", "symphony", "kollections", "cinematic"
).forEach { includeBuild("../$it") }

rootProject.name = "epsilon"

includeSubs("epsilon", ".", "core", "fake")
includeSubs("epsilon-file", "file", "core", "fields")
includeSubs("epsilon-network", "network", "ktor")
includeSubs("epsilon-image", "image", "core", "web")
includeSubs("epsilon-image-react", "image/react", "core", "dom")
includeSubs("epsilon-image-compose", "image/compose", "core", "html")

// grounds
includeSubs("grounds-battle", "grounds/battle", "react")
includeSubs("grounds-battle-compose", "grounds/battle/compose", "core", "html")
