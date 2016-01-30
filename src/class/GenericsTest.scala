/**
  * Project: Scala-example
  * FileName: GenericsTest
  * Date: 2016-01-30
  * Time: 오전 3:13
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object GenericsTest extends App{
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')
  println(stack.top)
  stack.pop()
  print(stack.top)
}
