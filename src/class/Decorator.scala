
/**
  * Project: Scala-example
  * FileName: Decorator
  * Date: 2016-02-11
  * Time: 오전 12:15
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}
object FunTest extends scala.App {
  def apply(f: Int => String, v: Int) = f(v)
  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
}