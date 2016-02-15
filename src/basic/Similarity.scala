package basic

/**
  * Project: Scala-example
  * FileName: Similarity
  * Date: 2016-02-16
  * Time: 오전 12:28
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}
