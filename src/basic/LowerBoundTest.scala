package basic

/**
  * Project: Scala-example
  * FileName: LowerBoundTest
  * Date: 2016-02-20
  * Time: 오후 2:39
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object LowerBoundTest extends App {
  val empty: ListNode[Null] = ListNode(null, null)
  val strList: ListNode[String] = empty.prepend("hello")
    .prepend("world")
  val anyList: ListNode[Any] = strList.prepend(12345)
}