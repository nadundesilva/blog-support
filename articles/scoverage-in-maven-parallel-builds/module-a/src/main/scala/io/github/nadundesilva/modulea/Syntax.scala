package io.github.nadundesilva.modulea

object Syntax {
  implicit def intSyntax(integer: Int): IntOps = new IntOps(integer)
}
