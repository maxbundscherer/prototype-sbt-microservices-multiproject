package com.mb.testtwo

import org.scalatest.{Matchers, WordSpec}

class ExampleTest extends WordSpec with Matchers {

  "Example test" should {

    "reply with true" in {

      true should be (true)

    }

  }

}