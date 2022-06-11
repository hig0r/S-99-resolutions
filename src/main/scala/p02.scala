import scala.annotation.tailrec

@tailrec
def penultimate[A](xs: List[A]): A =
  if xs.length < 2 then throw new NoSuchElementException()
  else xs match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
  }
