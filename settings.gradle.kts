pluginManagement {
    repositories {
        // 阿里云镜像（Google）
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
        }
        // 阿里云公共仓库
        maven {
            isAllowInsecureProtocol = true
            url = uri("https://maven.aliyun.com/nexus/content/groups/public")
        }

        // 官方仓库（带过滤规则）
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
        // 阿里云镜像（Google）
        maven {
            url = uri("https://maven.aliyun.com/repository/google")
        }
        // 阿里云公共仓库
        maven {
            isAllowInsecureProtocol = true
            url = uri("https://maven.aliyun.com/nexus/content/groups/public")
        }

        // 官方仓库
        google()
        mavenCentral()
    }
}

rootProject.name = "PhotoGallery"
include(":app")
