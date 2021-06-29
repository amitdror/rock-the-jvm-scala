package lectures.part2oop

object Objects {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bar")
  }

  class Person(val name: String) {
    // instance-level functionality
  }

  // COMPANIONS

  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    // Scala object = SINGLETON INSTANCE
    val meytal = new Person("Meytal")
    val amit = new Person("Amit")
    println(amit == meytal)

    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    //  val bar = Person.apply(amit, meytal)
    val bar = Person(amit, meytal)

    // Scala Applications = Scala object with
    // def main(args: Array[String]): Unit
  }
}
