package basic

/**
  * Project: Scala-example
  * FileName: UnifiedTypes
  * Date: 2016-02-29
  * Time: 오전 9:32
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object UnifiedTypes extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string"  // 문자열을 추가한다
  set += 732                 // 숫자를 추가한다
  set += 'c'                 // 캐릭터를 추가한다
  set += true                // 불리언 값을 추가한다
  set += main _              // 메인 함수를 추가한다
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())

  }
}