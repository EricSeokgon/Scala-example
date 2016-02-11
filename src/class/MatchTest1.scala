/**
  * Project: Scala-example
  * FileName: MatchTest1
  * Date: 2016-02-12
  * Time: 오전 12:10
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object MatchTest1 extends scala.App {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  println(matchTest(2))
}