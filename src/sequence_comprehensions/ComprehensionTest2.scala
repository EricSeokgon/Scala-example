package sequence_comprehensions

/**
  * Project: Scala-example
  * FileName: ComprehensionTest2
  * Date: 2016-01-29
  * Time: 오후 1:05
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object ComprehensionTest2 extends App {
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i + j == v) yield
      Pair(i, j);
  foo(20, 32) foreach {
    case (i, j) =>
      println("(" + i + ", " + j + ")")
  }
}
