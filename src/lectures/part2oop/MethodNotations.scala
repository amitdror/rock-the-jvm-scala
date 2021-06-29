package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val meytal = new Person("Meytal", "Inception")

  // "operators" in Scala
  val amit = new Person("Amit", "Fight Club")

  println(meytal hangOutWith amit)
  println(meytal + amit) // equivalent
  println(meytal.+(amit)) // equivalent

  // ALL OPERATORS ARE METHODS
  // ex: Akka actors have ! ?
  println(1 + 2)
  println(1.+(2))

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!meytal)
  println(meytal.unary_!)

  //infix notation = operator notation (syntactic sugar)
  println(meytal.likes("Inception"))
  println(meytal likes "Inception") // equivalent

  // postfix notation
  println(meytal.isAlive)
  println(meytal isAlive)

  // apply
  println(meytal.apply())
  print(meytal()) // equivalent
}
