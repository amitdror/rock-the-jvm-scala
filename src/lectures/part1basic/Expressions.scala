package lectures.part1basic

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 10 //also works with -= += *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionValue)
  println(if (aCondition) 5 else 3)

  var i = 0
  val aWhile: Unit = while (i < 10){
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.
  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) //Unit === void
  print(aWeirdValue)

  // Side Effects: println(), whiles loop, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world?")
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 123 else 456
    42
  }
  println(someOtherValue)

}
