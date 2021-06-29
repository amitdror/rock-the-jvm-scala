package lectures.part1basic

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)
  //COMPILER can infer types

  //values: IMMUTABLE
  val aString: String = "hello"
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 123456789123456789L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables: MUTABLE
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
