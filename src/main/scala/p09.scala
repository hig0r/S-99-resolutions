import scala.annotation.tailrec

def pack[A](xs: List[A]): List[List[A]] =
  @tailrec
  def run(xs: List[A], xss: List[List[A]]): List[List[A]] =
    xs match {
      case x :: xs if xss.isEmpty || xss.last.head != x => run(xs, xss :+ List(x))
      case x :: xs => run(xs, xss.dropRight(1) :+ (xss.last :+ x))
      case Nil => xss
    }

  run(xs, List.empty)