import com.android.build.api.dsl.androidLibrary
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.vanniktech.mavenPublish)
}

// ============================================================================
// TEMPLATE CONFIGURATION - Update these values using customizer.sh or manually
// ============================================================================
group = "io.github.template"
version = "1.0.0"

kotlin {
    // JVM target
    jvm()

    // Android target
    androidLibrary {
        namespace = "io.github.template"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withJava()
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }

        compilations.configureEach {
            compilerOptions.configure {
                jvmTarget.set(JvmTarget.JVM_11)
            }
        }
    }

    // iOS targets
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    // Linux target
    linuxX64()

    // macOS targets (optional - uncomment if needed)
    // macosX64()
    // macosArm64()

    // Windows target (optional - uncomment if needed)
    // mingwX64()

    // Source sets configuration
    sourceSets {
        commonMain.dependencies {
            // Add your multiplatform dependencies here
            // Example: implementation(libs.kotlinx.coroutines.core)
        }

        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }

        androidMain.dependencies {
            // Android-specific dependencies
        }

        iosMain.dependencies {
            // iOS-specific dependencies
        }

        jvmMain.dependencies {
            // JVM-specific dependencies
        }
    }
}

// ============================================================================
// MAVEN CENTRAL PUBLISHING CONFIGURATION
// Update these values for your library
// ============================================================================
mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    coordinates(group.toString(), "template-library", version.toString())

    pom {
        name = "TEMPLATE_LIBRARY_NAME"
        description = "TEMPLATE_DESCRIPTION"
        inceptionYear = "2024"
        url = "https://github.com/TEMPLATE_ORG/TEMPLATE_REPO/"

        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "repo"
            }
        }

        developers {
            developer {
                id = "DEVELOPER_ID"
                name = "DEVELOPER_NAME"
                url = "https://github.com/DEVELOPER_ID"
            }
        }

        scm {
            url = "https://github.com/TEMPLATE_ORG/TEMPLATE_REPO/"
            connection = "scm:git:git://github.com/TEMPLATE_ORG/TEMPLATE_REPO.git"
            developerConnection = "scm:git:ssh://git@github.com/TEMPLATE_ORG/TEMPLATE_REPO.git"
        }
    }
}
