package io.github.nadundesilva

object App {
  private def format(seconds: Seconds): String = s"${seconds.value} second(s)"

  implicit def toSeconds(minutes: Minutes): Seconds = Seconds(minutes.value * 60)

  class SecondsOps(seconds: Seconds) {
    def add(addition:      Seconds): Seconds = seconds.copy(value = seconds.value + addition.value)
    def subtract(addition: Seconds): Seconds = seconds.copy(value = seconds.value - addition.value)
  }

  implicit def secondsSyntax(seconds: Seconds): SecondsOps = new SecondsOps(seconds)

  def main(args: Array[String]): Unit = {
    val threeMinutes = Minutes(3)
    val sevenSeconds = Seconds(7)
    val nineSeconds  = Seconds(9)

    println(s"Formatted Time: ${format(threeMinutes)}")

    val difference = nineSeconds.subtract(sevenSeconds)
    println(s"Formatted Time: ${format(difference)}")

    val sum = nineSeconds.add(threeMinutes)
    println(s"Formatted Time: ${format(sum)}")
  }

}
