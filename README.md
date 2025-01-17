## Unsplash-API-KMP [![CI](https://github.com/dalafiarisamuel/unsplash-kmp/actions/workflows/workflow.yml/badge.svg?branch=master)](https://github.com/dalafiarisamuel/unsplash-kmp/actions/workflows/workflow.yml)

A project to display images from [Unsplash](https://unsplash.com) API using Kotlin Multiplatform

## Features

* Jetpack Compose
* Coil KMP
* MVI Architecture
* Kotlin Coroutines with Flow
* Koin
* Kotlin Gradle DSL
* Cashapp Paging
* Ktorfit
* Compose Multiplatform Navigation

## Libraries

- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Android’s modern toolkit for
  building native UI.
- [Coil KMP](https://github.com/coil-kt/coil) - An image loading library for Android & KMP
  backed by Kotlin Coroutines.
- [View Model](https://developer.android.com/topic/libraries/architecture/viewmodel) - Presenter for
  persisting view state across config changes
- [Ktorfit](https://foso.github.io/Ktorfit/installation/) - type safe http client and supports coroutines out
  of the box.
- [Kotlin Serialization](https://kotlinlang.org/docs/serialization.html#serialize-and-deserialize-json) - JSON
  Parser,used to parse requests from the API
- [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) - Library Support for
  coroutines
- [Cashapp Paging](https://github.com/cashapp/multiplatform-paging) - The Paging Library
  makes it easier for you to load data gradually and gracefully within your app based off Google's Paging3 Library
- [Compose Multiplatform navigation](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-navigation-routing.html) -
  Google's official Navigation
  library that is compatible with KMP
- [Koin](https://insert-koin.io/docs/reference/koin-mp/kmp/) - Kotlin Multiplatform Dependency Injection

## Prerequisite

* To successfully make API calls to [Unsplash](https://unsplash.com) Endpoint, use a valid API Token from Unsplash.
* Enter your valid API token [here](./composeApp/src/commonMain/kotlin/di/Koin.kt#L63)

## Mobile App Screenshots

| ![Screenshot 1](./images/screenshot_1.png) | ![Screenshot 2](./images/screenshot_2.png) |
|--------------------------------------------|--------------------------------------------|

| ![Screenshot 3](./images/screenshot_3.png) | ![Screenshot 4](./images/screenshot_4.png) |
|--------------------------------------------|--------------------------------------------|

## Desktop App Screenshots

| ![Desktop Screenshot 1](./images/desktop_screenshot_1.png) | ![Desktop Screenshot 2](./images/desktop_screenshot_2.png) |
|------------------------------------------------------------|------------------------------------------------------------|

## Before running

- Check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
- Install JDK 17 or higher on your machine

#### Android

To run the application on android device/emulator:

- open project in Android Studio and run imported android run configuration

#### Desktop

Run the desktop application: `./gradlew :composeApp:run` or `./gradlew run`

#### iOS

To run the application on iPhone device/simulator:

- Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
- Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile)
  for Android Studio
  Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`

<br>
