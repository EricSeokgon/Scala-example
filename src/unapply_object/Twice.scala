package unapply_object

/**
  * Project: Scala-example
  * FileName: Twice
<<<<<<< Updated upstream
  * Date: 2016-01-30
  * Time: 오전 2:11
=======
  * Date: 2016-01-29
  * Time: 오후 1:33
>>>>>>> Stashed changes
  * Author: Hadeslee 
  * Note: 
  * To change this template use File | Settings | File Templates.
  */
object Twice {
  def apply(x: Int): Int = x * 2

  def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None
}

object TwiceTest extends App {
  val x = Twice(21)
  x match {
    case Twice(n) => Console.println(n)
<<<<<<< Updated upstream
  }
}
=======
  } // prints 21
}


>>>>>>> Stashed changes
