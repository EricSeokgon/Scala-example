
/**
  * Project: Scala-example
  * FileName: TargetTest1
  * Date: 2016-02-08
  * Time: 오전 12:27
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object TargetTest1 extends scala.App {
  def whileLoop(cond: => Boolean)(body: => Unit): Unit =
    if (cond) {
      body
      whileLoop(cond)(body)
    }
  var i = 10
  whileLoop (i > 0) {
    println(i)
    i -= 1
  }
}