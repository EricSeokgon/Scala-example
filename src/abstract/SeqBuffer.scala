
/**
  * Project: Scala-example
  * FileName: SeqBuffer
  * Date: 2016-01-23
  * Time: 오전 1:08
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length

}
