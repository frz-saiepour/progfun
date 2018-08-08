package week3

object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  //error("test")
  val x = null                                    //> x  : Null = null
  
  val y: String = x                               //> y  : String = null
  //val z: Int = null
  
  if(true) 1 else false                           //> res0: AnyVal = 1
                                                  
}