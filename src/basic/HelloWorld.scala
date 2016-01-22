package basic

/**
  * Project: Scala-example
  * FileName: HelloWorld
  * Date: 2016-01-22
  * Time: 오전 10:49
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    print("Hello World")
  }

  println(1 + 1)
  val two = 1 + 1
  println(two)

  var name = "steve"
  println(name)

  name = "marius"
  println(name)

  def addOne(m: Int): Int = m + 1

  val three = addOne(2)
  println(three)

  def five() = 2 + 3
  println(five())
  println(five)



}
