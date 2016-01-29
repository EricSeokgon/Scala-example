package sequence_comprehensions

/**
  * Project: Scala-example
  * FileName: COmprehensionTest1
  * Date: 2016-01-29
  * Time: 오전 11:27
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object ComprehensionTest1 extends App {
  def even(from: Int, to: Int): List[Int] =
    for (i <- List.range(from, to) if i % 2 == 0) yield i
  Console.println(even(0, 20))
}
