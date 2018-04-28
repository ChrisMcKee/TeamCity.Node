import org.gradle.internal.impldep.org.testng.TestException

/*
 * Copyright 2013-2018 Eugene Petrenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


plugins {
    kotlin("jvm")
    id("com.github.rodm.teamcity-common")
}

dependencies {
    compile(kotlin("stdlib"))
    compile(project(":common"))
    compile(project(":agent"))
    compile(project(":server"))

    //copy-paste from agent module to workaournd duplicate files in .zip
    testCompile("com.google.code.gson:gson:2.2.4")
    testCompile("org.apache.httpcomponents:httpclient:4.2.6")

    testCompile("org.jetbrains.teamcity:tests-support:${rootProject.ext["teamcityVersion"]}")

    testCompile("org.testng:testng:6.13.1")
}

tasks.withType<Test> {
    useTestNG()
}
