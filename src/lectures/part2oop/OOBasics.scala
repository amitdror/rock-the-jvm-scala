package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Amit", 32)
  println(person.age)
  println(person.x)
  person.greet("Meytal")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1816, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc().print()
  counter.inc().inc().inc().print()
  counter.inc(10).print()

  //Ctor
  class Person(name: String, val age: Int = 0) {
    val x = 2

    println(1 + 3)

    //method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    //overloading
    def greet(): Unit = println(s"Hi, I am $name")

    //multiple constructors
    def this(name: String) = this(name, 0)

    def this() = this("John Doe")

  }

  // class parameters are NOT FIELDS

  // Novel & Writer

  class Writer(firstName: String, lastName: String, val year: Int) {

    def fullName(): String = s"${this.firstName} ${this.lastName}"
  }

  class Novel(name: String, yearOfRelease: Int, author: Writer) {

    def authorAge(): Int = this.yearOfRelease - this.author.year

    def isWrittenBy(author: Writer): Boolean = this.author == author

    def copy(newYearOfRelease: Int): Novel = new Novel(this.name, newYearOfRelease, this.author)
  }

  // Counter Class
  class Counter(var currentValue: Int = 0) {

    //  def currentCount():Int = this.currentValue --> or define field as val\var
    // Immutability

    def inc(): Counter = {
      println("incrementing")
      new Counter(currentValue + 1)
    }

    def dec(): Counter = {
      println("decrementing")
      new Counter(currentValue - 1)
    }

    def inc(count: Int): Counter = {
      if (count <= 0) this
      else inc().inc(count - 1)
    }

    def dec(count: Int): Counter = {
      if (count <= 0) this
      else dec().dec(count - 1)
    }

    def print(): Unit = println(currentValue)
  }
}