# TEMPLATE_LIBRARY_NAME

[![CI](https://github.com/TEMPLATE_ORG/TEMPLATE_REPO/actions/workflows/gradle.yml/badge.svg)](https://github.com/TEMPLATE_ORG/TEMPLATE_REPO/actions/workflows/gradle.yml)
[![Maven Central](https://img.shields.io/maven-central/v/TEMPLATE_PACKAGE/template-library.svg)](https://central.sonatype.com/artifact/TEMPLATE_PACKAGE/template-library)
[![Kotlin](https://img.shields.io/badge/kotlin-2.1.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A Kotlin Multiplatform library for [describe your library purpose here].

## Supported Platforms

| Platform | Targets |
|----------|---------|
| **Android** | Android Library |
| **iOS** | iosX64, iosArm64, iosSimulatorArm64 |
| **macOS** | macosX64, macosArm64 |
| **tvOS** | tvosX64, tvosArm64, tvosSimulatorArm64 |
| **watchOS** | watchosX64, watchosArm32, watchosArm64, watchosSimulatorArm64, watchosDeviceArm64 |
| **JVM** | jvm |
| **Linux** | linuxX64, linuxArm64 |
| **Windows** | mingwX64 |
| **JavaScript** | Browser, Node.js |
| **WebAssembly** | wasmJs (Browser, Node.js), wasmWasi |

## Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
// In your shared module
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation("TEMPLATE_PACKAGE:template-library:1.0.0")
        }
    }
}
```

### Version Catalog

```toml
[versions]
template-library = "1.0.0"

[libraries]
template-library = { module = "TEMPLATE_PACKAGE:template-library", version.ref = "template-library" }
```

## Quick Start

```kotlin
import TEMPLATE_PACKAGE.Greeting

fun main() {
    val greeting = Greeting()
    println(greeting.greet()) // Hello from [Platform]!
    println(greeting.greet("World")) // Hello, World! Welcome from [Platform].
}
```

## Getting Started with Development

### Prerequisites

- JDK 17 or higher
- Android SDK (for Android development)
- Xcode 15+ (for Apple platforms, macOS only)

### Setup

1. Clone the repository:
```bash
git clone https://github.com/TEMPLATE_ORG/TEMPLATE_REPO.git
cd TEMPLATE_REPO
```

2. Customize the template (first time only):
```bash
bash customizer.sh com.yourpackage.library YourLibraryName your-org
```

3. Set up git hooks:
```bash
bash scripts/setup-hooks.sh
```

4. Build the project:
```bash
./gradlew build
```

### Running Tests

```bash
# All platforms (requires macOS for Apple targets)
./gradlew allTests

# Specific platforms
./gradlew jvmTest
./gradlew testAndroidHostTest
./gradlew iosSimulatorArm64Test
./gradlew macosArm64Test
./gradlew jsNodeTest
./gradlew wasmJsNodeTest
```

### Code Quality

```bash
# Format code
./gradlew spotlessApply

# Run static analysis
./gradlew detekt
```

## Project Structure

```
.
├── library/                    # Library module
│   └── src/
│       ├── commonMain/         # Shared code for all platforms
│       ├── commonTest/         # Shared tests
│       ├── androidMain/        # Android-specific code
│       ├── appleMain/          # Shared Apple code (iOS, macOS, tvOS, watchOS)
│       ├── jvmMain/            # JVM-specific code
│       ├── linuxMain/          # Linux-specific code
│       ├── mingwMain/          # Windows-specific code
│       ├── jsMain/             # JavaScript-specific code
│       ├── wasmJsMain/         # WebAssembly JS-specific code
│       └── wasmWasiMain/       # WebAssembly WASI-specific code
├── scripts/                    # Automation scripts
├── config/                     # Detekt configuration
├── .github/                    # GitHub Actions & templates
├── customizer.sh               # Template customization script
└── build.gradle.kts            # Root build configuration
```

## Publishing to Maven Central

### Prerequisites

1. Create a [Sonatype account](https://central.sonatype.com/)
2. Generate a GPG key for signing
3. Configure GitHub secrets:
   - `MAVEN_CENTRAL_USERNAME` - Sonatype username
   - `MAVEN_CENTRAL_PASSWORD` - Sonatype password
   - `SIGNING_KEY_ID` - GPG key ID
   - `SIGNING_PASSWORD` - GPG key password
   - `GPG_KEY_CONTENTS` - Base64 encoded GPG private key

### Release Process

1. Update version in `library/build.gradle.kts`
2. Create a GitHub release with a tag (e.g., `v1.0.0`)
3. The publish workflow will automatically deploy to Maven Central

## Contributing

We welcome contributions! Please see our [Contributing Guide](CONTRIBUTING.md) for details.

## License

```
Copyright 2024 TEMPLATE_ORG

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## Acknowledgments

- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- [Gradle Maven Publish Plugin](https://vanniktech.github.io/gradle-maven-publish-plugin/)
