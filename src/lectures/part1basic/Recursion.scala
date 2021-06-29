package lectures.part1basic

import scala.annotation.tailrec

object Recursion extends App {

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, accumulator + aString)
  }

  println(concatenateTailRec("hello", 3, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeTailRec(t - 1)
    }

    isPrimeTailRec(n / 2)
  }

  println(isPrime(2003))
  println(isPrime(629))


  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailRec(i: Int, prevNumber: Int, currNumber: Int): Int = {
      if (i >= n) currNumber
      else fibonacciTailRec(i + 1, currNumber, prevNumber + currNumber)
    }

    if (n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }

  println(fibonacci(8)) // 1 1 2 3 5 8 13 21
}
