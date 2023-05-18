package io.github.nadundesilva.modulea

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class IntOpsSpec extends AnyFlatSpec with Matchers {
  import Syntax._

  behavior of "add"

  it should "add two positive numbers" in {
    2 plus 5 shouldBe 7
  }

  it should "add two negative numbers" in {
    -6 plus -3 shouldBe -9
  }

  it should "add two positive and negative numbers" in {
    7 plus -3 shouldBe 4
    -10 plus 7 shouldBe -3
  }

  behavior of "minus"

  it should "subtract positive number from positive number" in {
    2 minus 5 shouldBe -3
    13 minus 2 shouldBe 11
  }

  it should "subtract negative number from negative number" in {
    -6 minus -3 shouldBe -3
    -5 minus -17 shouldBe 12
  }

  it should "subtract positive number from negative number and vice versa" in {
    7 minus -3 shouldBe 10
    -10 minus 7 shouldBe -17
  }

  behavior of "times"

  it should "multiply two positive numbers" in {
    2 times 5 shouldBe 10
  }

  it should "multiply two negative numbers" in {
    -6 times -3 shouldBe 18
  }

  it should "multiply two positive and negative numbers" in {
    7 times -3 shouldBe -21
    -10 times 7 shouldBe -70
  }

  behavior of "divideBy"

  it should "divideBy positive number by positive number" in {
    20 divideBy 5 shouldBe 4
  }

  it should "divideBy negative number by negative number" in {
    -15 divideBy -3 shouldBe 5
    -34 divideBy -17 shouldBe 2
  }

  it should "divideBy positive number by negative number and vice versa" in {
    9 divideBy -3 shouldBe -3
    -49 divideBy 7 shouldBe -7
  }
}
