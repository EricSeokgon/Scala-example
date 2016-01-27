package basic

import java.text.DateFormat._
import java.util.{Date, Locale}

/**
  * Project: Scala-example
  * FileName: FrenchDate
  * Date: 2016-01-27
  * Time: 오후 5:14
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }

}
