
/**
  * Project: Scala-example
  * FileName: PolyTest
  * Date: 2016-02-14
  * Time: 오전 12:00
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object PolyTest extends scala.App {
  def dup[T](x: T, n: Int): List[T] =
    if (n == 0)
      Nil
    else
      x :: dup(x, n - 1)
  println(dup[Int](3, 4))
  println(dup("three", 3))
}