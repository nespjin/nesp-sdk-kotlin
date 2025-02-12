/*
 * Copyright (C) 2021 The NESP Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//apply plugin: 'java-library'
//apply plugin: 'kotlin'

group = "com.nesp.sdk.kotlin"
version = "1.0-alpha"


plugins {
    id("org.jetbrains.kotlin.jvm") version ("2.1.0")
    id("java")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(libs.google.gson)
    implementation(libs.squareup.okhttp3)
    implementation(files("libs/activation.jar", "libs/additionnal.jar", "libs/mail.jar"))
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
//    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0"
//
//    api 'com.google.code.gson:gson:2.8.9'
//    api 'com.squareup.okhttp3:okhttp:5.0.0-alpha.3'
//
//    implementation files('libs/activation.jar', 'libs/additionnal.jar', 'libs/mail.jar')

}

//kotlinOptions {
//    jvmTarget = JavaVersion.VERSION_1_8.toString()
//}

//sourceCompatibility = "1.8"
//targetCompatibility = "1.8"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}