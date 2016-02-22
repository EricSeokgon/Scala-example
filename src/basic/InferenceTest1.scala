package basic

/**
  * Project: Scala-example
  * FileName: InferenceTest1
  * Date: 2016-02-23
  * Time: 오전 12:24
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object InferenceTest1 extends App {
  val x = 1 + 2 * 3         // x의 타입은 Int다.
  val y = x.toString()      // y의 타입은 String이다.
  def succ(x: Int) = x + 1  // 메소드 succ는 Int 값을 반환한다.
}