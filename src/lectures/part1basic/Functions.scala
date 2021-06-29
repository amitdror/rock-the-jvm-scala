package lectures.part1basic

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 32

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))
  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  //1. A greeting function (name, age) => "Hi, my name is $name and I am &age years old"
  def greetingForKids(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."

  println(greetingForKids("Amit", 32))

  //2. Factorial function 1 * 2 * 3 * ... * n
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  //3. A Fibonacci function
  //    f(1) = 1
  //    f(2) = 1
  //    f(n) = f(n-1) + f(n-2)
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

    // 1 1 2 3 5 8 13 21...
  }

  println(fibonacci(8))

  //4. Test if a number is prime
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(37 * 3))
  println(isPrime(2))
}
