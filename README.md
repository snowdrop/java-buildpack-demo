## How To guide

- Start first your docker daemon locally ;-)
- Next, launch the java main class using the following command
  ```bash
  mvn compile exec:java
  ```
- Watch the log of the container created by the java client and executing the `buildpacks`
  ```text
  [INFO] --- exec-maven-plugin:3.0.0:java (default-cli) @ build-java-demo ---
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - Buildpack build invoked, preparing environment...
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - Build configured with..
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - build image : redhat/buildpacks-builder-maven-jvm:latest
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - run image : redhat/buildpacks-stack-snowdrop-run:jvm
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - build volumes created
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted buildpack-build-gfpucdupst at /bld
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted buildpack-launch-xtpouljceb at /launch
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted buildpack-app-cagcgtmaed at /app
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted buildpack-platform-klbtiozydw at /platform
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted /var/run/docker.sock at /var/run/docker.sock
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - mounted buildpack-output-qdxsguobvl at /out
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - build container id 253b1beb1ff0a7065b13105f72539842681937b22e2eed5e25b01a1014e19c2b
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - uploaded archive to container at /app/content
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - uploaded env to container at /platform/env
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - launching build container
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - - attaching log relay
  2021-07-08T10:31:06.850715672Z ===> DETECTING
  2021-07-08T10:31:06.854081618Z ======== Output: dev.snowdrop.buildpacks.buildpack@0.0.1 ========
  2021-07-08T10:31:06.854124395Z - Checking for Pom:
  2021-07-08T10:31:06.854132389Z - Checking for Snowdrop in Pom
  2021-07-08T10:31:06.854135016Z - Found.
  2021-07-08T10:31:06.854137240Z ======== Results ========
  2021-07-08T10:31:06.854139573Z pass: dev.snowdrop.buildpacks.buildpack@0.0.1
  2021-07-08T10:31:06.854142293Z Resolving plan... (try #1)
  2021-07-08T10:31:06.854145750Z dev.snowdrop.buildpacks.buildpack 0.0.1
  2021-07-08T10:31:06.854149728Z ===> ANALYZING
  2021-07-08T10:31:06.874738450Z Analyzing image "71a3ec299a2e65f5a5f34ee23e0200007bf40e782678f2dd4e8dc819b636b222"
  2021-07-08T10:31:06.874969639Z Skipping buildpack layer analysis
  2021-07-08T10:31:06.874984495Z ===> BUILDING
  2021-07-08T10:31:06.874989164Z Starting build
  2021-07-08T10:31:06.874991827Z Running build for buildpack dev.snowdrop.buildpacks.buildpack@0.0.1
  2021-07-08T10:31:06.874994300Z Looking up buildpack
  2021-07-08T10:31:06.875000564Z Finding plan
  2021-07-08T10:31:06.875003509Z Running build for buildpack Snowdrop Maven Buildpack 0.0.1
  2021-07-08T10:31:06.875005909Z Creating plan directory
  2021-07-08T10:31:06.875286679Z Preparing paths
  2021-07-08T10:31:06.875963356Z Running build command
  2021-07-08T10:31:06.881774294Z ---> Snowdrop Buildpack
  2021-07-08T10:31:06.881986018Z Building /app/content :: Native? 0
  2021-07-08T10:31:06.886429095Z Building using mvn package -B -DskipTests
  ...
  2021-07-08T10:30:14.062250177Z Layer 'dev.snowdrop.buildpacks.buildpack:m2repo' SHA: sha256:839269354d6f685668650e54738210c9c381663d796400ab6d09b1efda33fdc3
  [dev.snowdrop.demo.JavaBuildPackExample.main()] INFO dev.snowdrop.buildpack.BuildpackBuilderImpl - Buildpack build complete, with exit code 0
  ```