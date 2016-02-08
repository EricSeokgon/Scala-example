/**
  * Project: Scala-example
  * FileName: MyBool
  * Date: 2016-02-09
  * Time: 오전 12:00
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  def negate: MyBool = new MyBool(!x)
}