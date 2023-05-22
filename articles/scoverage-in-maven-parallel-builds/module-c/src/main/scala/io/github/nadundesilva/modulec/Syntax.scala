package io.github.nadundesilva.modulec

object Syntax {
  implicit def stringSyntax(string: String): StringOps = new StringOps(string)
}
