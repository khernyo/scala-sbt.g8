import sbt._
import sbt.Keys._
import com.typesafe.sbt.SbtScalariform._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++
      scalariformSettings ++
      Seq(
        name := "$name$",
        organization := "$organization$",
        version := "$version$",
        scalaVersion := "$scala_version$",

        scalacOptions ++= Seq(
          "-unchecked",
          "-deprecation",
          "-Dscala.timings=true",
          "-Ywarn-value-discard",
          "-encoding", "UTF-8",
          "-target:jvm-1.6",
          "-feature",
          "-Ywarn-adapted-args"
        ),

        resolvers ++= Seq(),
        libraryDependencies ++= Seq()
      )
  )
}
