
/**
  * Project: Scala-example
  * FileName: RegExpTest1
  * Date: 2016-02-15
  * Time: 오전 7:43
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object RegExpTest1 extends scala.App {
  def containsScala(x: String): Boolean = {
    val z: Seq[Char] = x
    z match {
      case Seq('s','c','a','l','a', rest @ _*) =>
        println("rest is "+rest)
        true
      case Seq(_*) =>
        false
    }
  }
}