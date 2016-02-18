package basic

/**
  * Project: Scala-example
  * FileName: UpperBoundTest
  * Date: 2016-02-19
  * Time: 오전 12:21
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object UpperBoundTest extends App {
  def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean =
    if (xs.isEmpty) false
    else if (e.isSimilar(xs.head)) true
    else findSimilar[T](e, xs.tail)
  val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))
  println(findSimilar[MyInt](MyInt(4), list))
  println(findSimilar[MyInt](MyInt(2), list))
}