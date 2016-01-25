/**
  * Project: Scala-example
  * FileName: Point
  * Date: 2016-01-25
  * Time: 오후 2:09
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }

  override def toString(): String = "(" + x + ", " + y + ")";

}
