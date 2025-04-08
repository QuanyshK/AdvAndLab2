pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/QuanyshK/ChatEchoLib")
            credentials {
                username = "QuanyshK"
                password = "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"
            }
        }
    }
}

rootProject.name = "AdvAndLab2"
include(":app")
 