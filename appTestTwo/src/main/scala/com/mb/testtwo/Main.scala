package com.mb.testtwo

import com.mb.helperexample.HelpMeNow
import com.typesafe.config.ConfigFactory
import org.apache.log4j.Logger

object Main extends App {

  private val appName: String = ConfigFactory.load().getConfig("mb-prototype").getString("app-name")

  private val log: Logger = Logger.getLogger(this.getClass.getSimpleName)

  log.info(s"Hello there! My name is $appName")
  log.info(s"Global Helper used: " + HelpMeNow.helpMeNow)
}