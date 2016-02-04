
/**
  * Project: Scala-example
  * FileName: AbsIterator
  * Date: 2016-02-05
  * Time: 오전 12:29
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}