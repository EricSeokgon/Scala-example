import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
  * Project: Scala-example
  * FileName: FrenchDate
  * Date: 2016-02-04
  * Time: 오전 12:44
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}