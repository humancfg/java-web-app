group = "com.happypath"
version = "0.0.1-SNAPSHOT"
description = "omni"

tasks.register<GradleBuild>("cleanBuildM1Api") {
    group = "build"
    dir = file("./m1-api")
    tasks = listOf("clean", "build")
}

