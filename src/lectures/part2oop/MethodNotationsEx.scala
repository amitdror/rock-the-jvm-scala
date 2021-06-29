package lectures.part2oop

object MethodNotationsEx extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favoriteMovie //
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}" //
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}" //
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie, age) //ex1
    def unary_! : String = s"$name, what the heck?!" //
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1) //ex2
    def isAlive: Boolean = true //
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie" //
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times" //
    def learns(topic: String): String = s"$name is learning $topic" //
    def learnScala(): String = this learns "Scala" //
  }

  val meytal = new Person("Meytal", "Inception")

  //  1. Overload the + operator
  //    meytal + "the rockstart" => new person "Mary (the rockstar)"
  println("EX1:")
  println((meytal + "ציקי") ())
  println((meytal + "ציקי").apply())

  //  2. Add an age to the Person class
  //     Add a unary + operator -> new person with the age + 1
  //     +metyal => metyal with the age incrementer
  println("EX2")
  println((+meytal).age)

  //  3. Add a "learns" method in the Person class => "Meytal learns Scala"
  //     Add a learnsScala method, calls learns method with "Scala".
  //     Use it in post fix notation
  println("EX3")
  println(meytal learns "Java")
  println(meytal learnScala)

  //  4. Overload the apply method
  //     meytal.apply(2) => "Meytal watched Inception 2 times"
  println("EX4")
  println(meytal(2))

}