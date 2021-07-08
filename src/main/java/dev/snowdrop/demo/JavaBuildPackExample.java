package dev.snowdrop.demo;

import dev.snowdrop.buildpack.BuildpackBuilder;

import java.io.File;

public class JavaBuildPackExample {

    public static String APP_DIR = "./app/springboot-app";
    public static String FINAL_IMAGE_NAME = "snowdrop/java-app:latest";
    public static String BUILD_IMAGE_NAME = "redhat/buildpacks-builder-maven-jvm:latest";

    public static void main(String[] args) throws Exception {
        BuildpackBuilder.get()
                .withContent(new File(APP_DIR))
                .withBuildImage(BUILD_IMAGE_NAME)
                .withFinalImage(FINAL_IMAGE_NAME)
                .build();
    }
}
