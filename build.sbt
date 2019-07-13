import Dependencies._


name := "eltaieb-parent"
version in ThisBuild := "1.0.0-SNAPSHOT" 
scalaVersion in ThisBuild := "2.12.3" 



lazy val eltaieb_entity = (project in file("eltaieb-entity"))

lazy val eltaieb_model = (project in file("eltaieb-model"))

lazy val eltaieb_dao = (project in file("eltaieb-dao"))
                       .dependsOn(eltaieb_entity)

lazy val eltaieb_service = (project in file("eltaieb-service"))
                            .dependsOn(eltaieb_entity)
                            .dependsOn(eltaieb_model)
                            .dependsOn(eltaieb_dao)

lazy val eltaieb_rest = (project in file("eltaieb-rest"))
                            .dependsOn(eltaieb_service)
                            .dependsOn(eltaieb_model)

 

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
