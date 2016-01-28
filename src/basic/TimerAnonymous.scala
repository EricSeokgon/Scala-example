package basic

/**
  * Project: Scala-example
  * FileName: TimerAnonymous
  * Date: 2016-01-28
  * Time: 오전 11:45
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object TimerAnonymous {
  def oncePerSecond(callbak: () => Unit): Unit = {
    while (true) {
      callbak(); Thread sleep 1000
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }

}
