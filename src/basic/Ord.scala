package basic

/**
  * Project: Scala-example
  * FileName: Ord
  * Date: 2016-01-29
  * Time: 오전 12:04
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
trait Ord {
  def < (that: Any): Boolean
  def <=(that: Any): Boolean =  (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >=(that: Any): Boolean = !(this < that)
}
