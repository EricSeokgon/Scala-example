/**
  * Project: Scala-example
  * FileName: IntSeqBuffer
  * Date: 2016-01-24
  * Time: 오전 12:31
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

object AbstractTypeTest1 extends App {
  def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element = List(elem1, elem2)
    }

  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element)
}