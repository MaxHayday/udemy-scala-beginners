package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b

    aSmallFunction(n, n - 1)
  }


  /*
    Exercises:
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */


  def greeting(name: String, age: Int) = println(s"Hi, my name is $name and I am $age years old.")

  greeting("Max", 30)

  def factorial(number: Int): Int = {
    if (number <= 0) 1
    else number * factorial(number - 1)
  }

  println(factorial(3))

  def fibonacci(number: Int): Int = {
    if (number <= 2) 1
    else fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(6))

  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else number % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(number / 2)
  }

  println(isPrime(17))
}
