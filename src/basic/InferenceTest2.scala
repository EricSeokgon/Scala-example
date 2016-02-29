package basic

/**
  * Project: Scala-example
  * FileName: InferenceTest2
  * Date: 2016-02-24
  * Time: 오전 12:08
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object InferenceTest2 {
  def fac(n: Int) = if (n == 0) 1 else n*fac(n - 1)
}
