/**
  * Project: Scala-example
  * FileName: Stack
  * Date: 2016-01-30
  * Time: 오전 2:58
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Stack[T] {
  var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }

  def top: T = elems.head

  def pop() {
    elems = elems.tail
  }
}
