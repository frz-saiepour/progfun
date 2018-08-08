package week3

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(54); 
  
  
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(36); 
  
  //error("test")
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(23); 
  
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(49); val res$0 = 
  //val z: Int = null
  
  if(true) 1 else false;System.out.println("""res0: AnyVal = """ + $show(res$0))}
                                                  
}
