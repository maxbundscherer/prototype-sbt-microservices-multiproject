/**
  * Helper Example
  */
lazy val helperExample = project.in(file("helperExample"))

    .settings(DefaultCommons.Settings.getDefaultSettings(myName = "HelperExample", myVersion = "0.0.1"))
    .settings( libraryDependencies ++= DefaultCommons.Dependencies.getDefaultDependencies )
/**
  * Test One
  */
lazy val appTestOne = project.in(file("appTestOne"))

    .settings(DefaultCommons.Settings.getDefaultSettings(myName = "TestOne", myVersion = "0.0.1"))
    .settings( libraryDependencies ++= DefaultCommons.Dependencies.getDefaultDependencies )
    /**
    * Docker image
    */
    .enablePlugins(JavaAppPackaging, DockerPlugin)
    .settings(dockerEntrypoint := Seq("bin/%s" format executableScriptName.value, "-Dconfig.resource=docker.conf"))

/**
  * Test Two
  */
lazy val appTestTwo = project.in(file("appTestTwo"))

  .settings(DefaultCommons.Settings.getDefaultSettings(myName = "TestTwo", myVersion = "0.0.1"))
  .settings( libraryDependencies ++= DefaultCommons.Dependencies.getDefaultDependencies )
  /**
    * Docker image
    */
  .enablePlugins(JavaAppPackaging, DockerPlugin)
  .settings(dockerEntrypoint := Seq("bin/%s" format executableScriptName.value, "-Dconfig.resource=docker.conf"))
    /**
    * Internal dependencies
    */
  .dependsOn(helperExample)

/**
  * Root - only for project/DefaultCommons.scala and project/plugins.sbt
  */
lazy val root = project.in(file("."))