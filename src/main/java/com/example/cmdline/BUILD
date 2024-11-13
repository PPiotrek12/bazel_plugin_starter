load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_jvm_external//:defs.bzl", "artifact")

java_binary(
    name = "runner",
    srcs = ["Runner.java"],
    main_class = "com.example.cmdline.Runner",
    deps = ["//:greeterKotlin", artifact("commons-cli:commons-cli")],
)
