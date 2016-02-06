package function

/**
  * Project: Scala-example
  * FileName: TargetTest1
  * Date: 2016-02-07
  * Time: 오전 12:08
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object TargetTest1 extends App {
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