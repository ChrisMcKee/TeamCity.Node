package TeamCityNodePlugin.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '0c137359-ef2c-4510-8196-cd5926d6ee0b' (id = 'bt434')
accordingly, and delete the patch script.
*/
changeBuildType("0c137359-ef2c-4510-8196-cd5926d6ee0b") {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}
