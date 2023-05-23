package io.github.nadundesilva.moduleb

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonOpsSpec extends AnyFlatSpec with Matchers {
  import Syntax._

  "slow test" should "wait for a long long time" in {
    println("Going to sleep")
    Thread.sleep(10000)
    println("Waking up")
  }

  behavior of "moveTo"

  it should "change the residing city to the new city" in {
    val henry = Person(name = "Henry", residingCity = "Colombo, Sri Lanka", birthCity = "Colombo, Sri Lanka")
    henry.moveTo("Auckland, New Zealand") shouldBe Person(
      name = "Henry",
      residingCity = "Auckland, New Zealand",
      birthCity = "Colombo, Sri Lanka"
    )
  }

  it should "not change the residing city to the new city if the new city is blank" in {
    val henry = Person(name = "Henry", residingCity = "Colombo, Sri Lanka", birthCity = "Colombo, Sri Lanka")
    henry.moveTo("") shouldBe henry
  }

  behavior of "changeName"

  it should "change the name to the new name" in {
    val henry = Person(name = "Henry", residingCity = "Colombo, Sri Lanka", birthCity = "Colombo, Sri Lanka")
    henry.changeName("Bryan") shouldBe Person(
      name = "Bryan",
      residingCity = "Colombo, Sri Lanka",
      birthCity = "Colombo, Sri Lanka"
    )
  }

  it should "not change the name to the new name if the new name is blank" in {
    val henry = Person(name = "Henry", residingCity = "Colombo, Sri Lanka", birthCity = "Colombo, Sri Lanka")
    henry.changeName("") shouldBe henry
  }

}
