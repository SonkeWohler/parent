scalaVersion := "2.13.1"
name := "parent"
organization := "me"
version := "0.1"

lazy val jModule = (project in file("jModule"))
lazy val sModule = (project in file("sModule"))
