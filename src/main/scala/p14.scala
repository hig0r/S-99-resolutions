def duplicate[A](xs: List[A]): List[A] =
  xs match {
    case x :: xs => List(x, x) ++ duplicate(xs)
    case Nil => Nil
  }