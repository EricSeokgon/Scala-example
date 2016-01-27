package basic

/**
  * Project: Scala-example
  * FileName: Timer
  * Date: 2016-01-27
  * Time: 오후 5:20
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object Timer {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback(); Thread sleep 1000
    }
  }

  def timeFiles(): Unit = {
    println("time files like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFiles)
  }
}
