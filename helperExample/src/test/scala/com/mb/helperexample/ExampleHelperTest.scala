package com.mb.helperexample

import org.scalatest.{Matchers, WordSpec}

class ExampleHelperTest extends WordSpec with Matchers {

  " Example helper" should {

    "reply with a test message" in {

      HelpMeNow.helpMeNow should be ("Helped now!")

    }

  }

}