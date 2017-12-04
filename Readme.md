# Prototype SBT microservices multi-project

[![Travis](https://img.shields.io/travis/rust-lang/rust.svg)](#)
[![shields.io](http://img.shields.io/badge/license-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

**Prototypes a sbt mulit-project (microservices-way)**

Author: Maximilian Bundscherer (https://bundscherer-online.de)

## Features

- Docker local publish included
- Generate test coverage report(s)
- Different example projects included
- Example external dependencies (logging and more) included
- Example internal dependencies (helperExample) included

### Used technologies

- Docker: *Container*
- Scala: *programming language*
- ScalaTest: *testing project*
- sbt-scoverage: *generate test coverage report(s)*

## Example project overview

Example projects are:

- TestOne (project-name = ``appTestOne``)
- TestTwo (project-name = ``appTestTwo``)

A global helper is located in ``helperExample``. This helper is needed by appTestTwo.

### Global settings, dependencies and plugins

Global Setting and dependencies are located in ``./project/DefaultCommons.scala``

Please see global build.sbt file located in ``./build.sbt`` and global plugins file located in ``./project/plugins.sbt``

## Description

Project is written in **scala**. Used log-library: **Apache Log4j 2**.

SBT is required.

- Run a project with ``sbt "project <project-name>" run``
- Test a project with ``sbt "project <project-name>" clean coverage test``
- Generate coverage report(s) with ``sbt "project <project-name>" coverageReport``
- Docker local publish with ``sbt "project <project-name>" docker:publishLocal``

Example: ``sbt "project appTestOne" run``