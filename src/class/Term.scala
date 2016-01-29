
/**
  * Project: Scala-example
  * FileName: Term
  * Date: 2016-01-29
  * Time: 오전 10:55
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
abstract class Term {

  case class Var(name: String) extends Term

  case class Fun(arg: String, body: Term) extends Term

  case class App(f: Term, v: Term) extends Term

}
