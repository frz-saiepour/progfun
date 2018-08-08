package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(45); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(699); 
  /*

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double): Double =
    (guess + x / guess) / 2

  	def sqrt(x: Double): Double = sqrtIter(1.0,x)
	*/

  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)

  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e60);System.out.println("""res3: Double = """ + $show(res$3))}
}
