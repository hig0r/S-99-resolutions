import scala.annotation.tailrec

@tailrec
def last[A](xs: List[A]): A =
  xs match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case Nil => throw new NoSuchElementException()
  }