
/**
  * Project: Scala-example
  * FileName: TargetTest2
  * Date: 2016-02-10
  * Time: 오전 12:04
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object TargetTest2 extends scala.App {
  def loop(body: => Unit): LoopUnlessCond =
    new LoopUnlessCond(body)
  protected class LoopUnlessCond(body: => Unit) {
    def unless(cond: => Boolean) {
      body
      if (!cond) unless(cond)
    }
  }
  var i = 10
  loop {
    println("i = " + i)
    i -= 1
  } unless (i == 0)
}