def compress[A](xs: List[A]): List[A] =
  xs match {
    case _ :: Nil => xs
    case x :: xs if x == xs.head => compress(xs)
    case x :: xs => x +: compress(xs)
  }