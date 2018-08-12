package week4

import week3._


trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false
}

//class Nil[T] extends List[T] {
//  def isEmpty = true
//  def head: Nothing = throw new NoSuchElementException("Nil head")
//  def tail: Nothing = throw new NoSuchElementException("Nil head")
//}
object Nil extends List[Nothing] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil head")
  def tail: Nothing = throw new NoSuchElementException("Nil head")
}

object test1 {
  val x: List[String] = Nil

  //def f(xs: List[NonEmpty], x: Empty) = xs prepend x
}

object List {
  //List(1,2) = List.apply(1,2)
  
  def apply[T](x1: T, x2:T) = new Cons(x1,new Cons(x2, Nil))
  def apply[T]()= Nil
}


object test {
  def Singleton[T](elem: T) = new Cons[T](elem, Nil)
  
  Singleton[Int](1)
  Singleton[Boolean](true)
  
  
  Singleton(2)
}
