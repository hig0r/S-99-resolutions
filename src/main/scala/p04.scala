import scala.annotation.tailrec

def length[A](xs: List[A]) =
  @tailrec
  def run(xs: List[A], count: Int): Int =
    xs match {
      case Nil => count
      case _ :: xs => run(xs, count + 1)
    }

  run(xs, 0)