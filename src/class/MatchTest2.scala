/**
  * Project: Scala-example
  * FileName: MatchTest2
  * Date: 2016-02-13
  * Time: 오전 12:44
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object MatchTest2 extends scala.App {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
  }
  println(matchTest("two"))
}