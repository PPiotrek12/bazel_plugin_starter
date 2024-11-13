load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    main_class = "com.example.ProjectRunner",
    deps = [":greeterKotlin"],
)

kt_jvm_library(
    name = "greeterKotlin",
    srcs = ["src/main/java/com/example/Greeting.kt"],
    visibility = ["//src/main/java/com/example/cmdline:__pkg__"]
)
 