package io.github.nadundesilva.modulec

class StringOps(string: String) {
  def charCount: Int                           = string.length
  def charSeq: Seq[Char]                       = string.toCharArray.toSeq
  def concatenate(otherString: String): String = s"$string$otherString"
  def startingFrom(startIndex: Int): String    = string.substring(startIndex)
}
