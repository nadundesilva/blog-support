package io.github.nadundesilva.modulec

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StringOpsSpec extends AnyFlatSpec with Matchers {
  import Syntax._

  behavior of "charCount"

  it should "return length of string" in {
    "maven".charCount shouldBe 5
  }

  it should "return 0 for empty strings" in {
    "".charCount shouldBe 0
  }

  behavior of "charSeq"

  it should "return chars of the string" in {
    "scalatest".charSeq shouldBe Seq('s', 'c', 'a', 'l', 'a', 't', 'e', 's', 't')
  }

  it should "return an empty array for empty string" in {
    "".charSeq shouldBe Seq.empty
  }

  behavior of "concatenate"

  it should "concatenate two strings" in {
    "foo" concatenate "bar" shouldBe "foobar"
  }

  it should "do nothing with empty strings" in {
    "foo" concatenate "" shouldBe "foo"
  }

  behavior of "startingFrom"

  it should "return a substring for an index lower than length" in {
    "parallel" startingFrom 3 shouldBe "allel"
  }

  it should "return exact string for index 0" in {
    "compilation" startingFrom 0 shouldBe "compilation"
  }

  it should "return empty string when index is equal to length of string" in {
    "scala rocks" startingFrom "scala rocks".length shouldBe ""
  }

  it should "throw and error when index is larger than string length" in {
    assertThrows[StringIndexOutOfBoundsException] {
      "scala rocks" startingFrom 100
    }
  }

}
