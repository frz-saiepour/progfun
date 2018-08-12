

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : NonEmpty = """ + $show(t1 ));$skip(41); 
	val t2 = t1 incl 5 incl 6 incl 2 incl 4;System.out.println("""t2  : IntSet = """ + $show(t2 ));$skip(41); 
	val t3 = t1 incl 4 incl 5 incl 2 incl 6;System.out.println("""t3  : IntSet = """ + $show(t3 ));$skip(158); 
	
	//val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
	//val b: Array[IntSet] = a

	val a1: List[NonEmpty] = List(new NonEmpty(1, Empty, Empty));System.out.println("""a1  : List[NonEmpty] = """ + $show(a1 ));$skip(27); 
	val b2: List[IntSet] = a1;System.out.println("""b2  : List[IntSet] = """ + $show(b2 ))}
	
}


abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet

}
/*
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
}
*/


object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  override def toString = "."
  def union(other: IntSet) = other
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = {
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true
  }

  def incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  
  def union(other: IntSet) = {
  		((left union right) union other) incl elem
  }
 
 	override def toString = "{" + left + elem + right + "}"
}
