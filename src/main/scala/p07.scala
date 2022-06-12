def flatten(xs: List[Any]): List[Any] =
  xs match {
    case Nil => xs
    case (x: List[Any]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x +: flatten(xs)
  }