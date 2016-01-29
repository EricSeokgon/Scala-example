package compound_types

/**
  * Project: Scala-example
  * FileName: Cloneable
  * Date: 2016-01-29
  * Time: 오전 11:21
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}

trait Resetable {
  def reset: Unit
}