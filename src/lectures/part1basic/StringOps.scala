package lectures.part1basic

object StringOps extends App {

  val str: String = "Hello I am learning Scala"

  println(str.charAt(2)) //str[2] = l
  println(str.substring(7, 11)) //str[7]...str[10]
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' + aNumberString + 'z')
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala specific: String interpolators

  // S-interpolators
  val name = "Amit"
  val age = 32
  val greeting = s"Hello, my name is $name and I'm $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s  can eat $speed%2.2f burgers per minutes"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")
}
