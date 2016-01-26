package basic

/**
  * Project: Scala-example
  * FileName: Upper
  * Date: 2016-01-26
  * Time: 오전 9:46
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }
}

