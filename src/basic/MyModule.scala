package basic

/**
  * Project: Scala-example
  * FileName: MyModule
  * Date: 2016-01-25
  * Time: 오후 3:33
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
