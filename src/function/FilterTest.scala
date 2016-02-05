package function

/**
  * Project: Scala-example
  * FileName: FilterTest
  * Date: 2016-02-06
  * Time: 오전 7:02
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object FilterTest extends App {
  def filter(xs: List[Int], threshold: Int) = {
    def process(ys: List[Int]): List[Int] =
      if (ys.isEmpty) ys
      else if (ys.head < threshold) ys.head :: process(ys.tail)
      else process(ys.tail)
    process(xs)
  }
  println(filter(List(1, 9, 2, 8, 3, 7, 4), 5))
}