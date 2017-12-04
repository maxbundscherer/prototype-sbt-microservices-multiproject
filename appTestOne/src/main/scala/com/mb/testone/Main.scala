package com.mb.testone

import java.util.logging.Logger

import com.typesafe.config.ConfigFactory

object Main extends App {

  private val appName: String = ConfigFactory.load().getConfig("mb-prototype").getString("app-name")

  private val log: Logger = Logger.getLogger(this.getClass.getSimpleName)

  log.info(s"Hello there! $appName")
}