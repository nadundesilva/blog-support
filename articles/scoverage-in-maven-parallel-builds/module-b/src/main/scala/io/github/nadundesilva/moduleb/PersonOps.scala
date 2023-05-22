package io.github.nadundesilva.moduleb

class PersonOps(person: Person) {
  def moveTo(newCity: String): Person     = if (newCity.isEmpty) person else person.copy(residingCity = newCity)
  def changeName(newName: String): Person = if (newName.isEmpty) person else person.copy(name = newName)
}
