load("@rules_java//java:defs.bzl", "java_binary")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    main_class = "com.example.ProjectRunner",
    deps = [":greeter2"],
)
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")


kt_jvm_library(
    name = "greeter2",
    srcs = ["src/main/java/com/example/Greeting.kt"],
)
 