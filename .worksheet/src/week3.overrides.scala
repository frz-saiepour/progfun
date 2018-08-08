package week3

object overrides {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet")}
}

abstract class base {
	def foo = 1
	def bar: Int
}

class sub extends base {
	override def foo = 2
	def bar = 3
}
