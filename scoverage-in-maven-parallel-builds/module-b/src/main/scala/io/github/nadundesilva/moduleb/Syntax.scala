package io.github.nadundesilva.moduleb

object Syntax {
  implicit def personSyntax(car: Person): PersonOps = new PersonOps(car)
}
