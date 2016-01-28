package basic

/**
  * Project: Scala-example
  * FileName: ComplexNumbers
  * Date: 2016-01-28
  * Time: 오후 2:22
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("imaginary part: " + c.im())
  }

}
