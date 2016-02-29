package basic

/**
  * Project: Scala-example
  * FileName: MyPair
  * Date: 2016-02-25
  * Time: 오전 12:16
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
case class MyPair[A, B](x: A, y: B);
object InferenceTest3 extends App {
  def id[T](x: T) = x
  val p = MyPair(1, "scala") // 타입: MyPair[Int, String]
  val q = id(1)              // 타입: Int
}