package week3

object overrides {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}

abstract class base {
	def foo = 1
	def bar: Int
}

class sub extends base {
	override def foo = 2
	def bar = 3
}