package basic

/**
  * Project: Scala-example
  * FileName: Upper2
  * Date: 2016-01-26
  * Time: 오전 9:55
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object Upper2 {
  def upper(strings: String*) = strings.map(_.toUpperCase())

  println(Upper2.upper("Hello", "World!"))
}


