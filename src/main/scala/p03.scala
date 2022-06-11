import scala.annotation.tailrec

@tailrec
def nth[A](n: Int, xs: List[A]): A =
  if n == 0 then xs.head else nth(n - 1, xs.tail)