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
  type U = Int;
}

object AbstractTypeTest1 extends App {
  def newIntSeqBuf(elem1: Int, elem2: Int, elem3: Int): IntSeqBuffer =
    new IntSeqBuffer {
      type T = List[U]
      val element: T = List(elem1, elem2, elem3)
    }

  val buf = newIntSeqBuf(7, 8, 9)
  println("lenght = " + buf.length)
  println("content = " + buf.element)
}