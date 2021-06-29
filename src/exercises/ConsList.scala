package exercises


sealed trait NodeInterface {

  def value(): Int

  def next(): NodeInterface
}

class ConsList(value: Int, next: NodeInterface) extends NodeInterface {

  override def value(): Int = value

  override def next(): NodeInterface = next
}

class NilNode extends NodeInterface {
  override def value(): Int = ???

  override def next(): NodeInterface = ???
}
