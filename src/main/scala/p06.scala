import scala.annotation.tailrec

def isPalindrome[A](xs: List[A]): Boolean =
  @tailrec
  def run(xs: List[A], n: Int): Boolean =
    if xs.length / 2 == n then true
    else nth(n, xs) == nth(xs.length - 1 - n, xs) && run(xs, n + 1)

  run(xs, 0)