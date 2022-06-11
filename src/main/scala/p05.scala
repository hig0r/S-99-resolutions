import scala.annotation.tailrec

def reverse[A](xs: List[A]): List[A] =
  @tailrec
  def run(xs1: List[A], xs2: List[A]): List[A] =
    xs1 match {
      case x :: xs => run(xs, x :: xs2)
      case Nil => xs2
    }

  run(xs, List.empty)