package sequence_comprehensions

/**
  * Project: Scala-example
  * FileName: ComprehensionTest3
  * Date: 2016-01-29
  * Time: 오후 1:11
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object ComprehensionTest3 extends App {
  for (i <- Iterator.range(0, 20);
       j <- Iterator.range(i, 20) if i + j == 32)
    println("(" + i + ", " + j + ")")
}
