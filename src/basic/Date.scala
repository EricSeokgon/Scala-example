package basic

/**
  * Project: Scala-example
  * FileName: Date
  * Date: 2016-01-29
  * Time: 오전 12:03
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y
  def month = m
  def day = d
  override def toString(): String = year + "-" + month + "-" + day