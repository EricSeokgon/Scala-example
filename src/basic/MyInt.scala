package basic

/**
  * Project: Scala-example
  * FileName: MyInt
  * Date: 2016-02-18
  * Time: 오전 12:02
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
case class MyInt(x: Int) extends Similar {
  def isSimilar(m: Any): Boolean =
    m.isInstanceOf[MyInt] &&
      m.asInstanceOf[MyInt].x == x
}