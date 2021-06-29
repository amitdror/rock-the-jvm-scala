package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {

    val creatureType: String = "wild"

    def eat(): Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "dog"

    override def eat(): Unit = println("Dog::eat")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): String

    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {

    override val creatureType: String = "crocodile"

    def eat(): Unit = println("Crocodile::eat")

    def eat(animal: Animal): String = s"I'm a crocodile and I'm eating ${animal.creatureType}"
  }

  val dog = new Dog()
  val croc = new Crocodile()
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
