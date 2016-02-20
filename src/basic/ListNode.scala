package basic

/**
  * Project: Scala-example
  * FileName: ListNode
  * Date: 2016-02-20
  * Time: 오후 2:39
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
case class ListNode[+T](h: T, t: ListNode[T]) {
  def head: T = h
  def tail: ListNode[T] = t
  def prepend[U >: T](elem: U): ListNode[U] =
    ListNode(elem, this)
}
