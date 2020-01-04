package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradlePlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println ">>>>>>>>>>> GradlePlugin: $project.name"
    }
}