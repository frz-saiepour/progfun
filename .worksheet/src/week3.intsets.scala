package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  val t1 = new NonEmpty(3, new Empty, new Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(20); 
	val t2 = t1 Incl 4;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ))}
}

abstract class IntSet {
  def Incl(x: Int): IntSet
  def contains(x: Int): Boolean

}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def Incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = {
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true
  }

  def Incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(x, left Incl x, right)
    else if (x > elem) new NonEmpty(x, left, right Incl x)
    else this
  }
 
 	override def toString = "{" + left + elem + right + "}"
}
