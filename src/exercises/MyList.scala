package exercises

// head = first element of the list
// tail = remainder of the list
// isEmpty = is this list empty
// add(int) = new List with this element added
// toString = a string representation of the list

abstract class MyList {

  def head(): Int

  def tail(): MyList

  def isEmpty: Boolean

  def add(element: Int): MyList

  def printElements(): String

  override def toString: String = s"[ ${this.printElements()}]"
}

object Empty extends MyList {

  override def head(): Int = throw new NoSuchElementException

  override def tail(): MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new Cons(element, Empty)

  override def printElements(): String = ""
}

class Cons(head: Int, tail: MyList = Empty) extends MyList {

  override def head(): Int = head

  override def tail(): MyList = tail

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)

  override def printElements(): String = head + " " + tail.printElements()
}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3)))
  println(list.add(4).head())
  println(list.toString)
}


