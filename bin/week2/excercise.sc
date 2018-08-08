package week2

object excercise {
  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
     loop(1,n)
  }                                               //> factorial: (n: Int)Int
  
  factorial(3)                                    //> res0: Int = 6
  factorial(4)                                    //> res1: Int = 24
  factorial(5)                                    //> res2: Int = 120
  factorial(6)                                    //> res3: Int = 720
}