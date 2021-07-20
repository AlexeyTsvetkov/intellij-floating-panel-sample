package com.github.alexeytsvetkov.intellijfloatingpanelsample.services

import com.github.alexeytsvetkov.intellijfloatingpanelsample.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
