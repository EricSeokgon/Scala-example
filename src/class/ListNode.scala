
/**
  * Project: Scala-example
  * FileName: ListNode
  * Date: 2016-02-20
  * Time: 오전 12:04
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
case class ListNode[T](h: T, t: ListNode[T]) {
  def head: T = h
  def tail: ListNode[T] = t
  def prepend(elem: T): ListNode[T] =
    ListNode(elem, this)
}