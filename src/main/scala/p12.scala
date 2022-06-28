def decode[A](xs: List[(Int, A)]): List[A] =
  xs match {
    case x :: xs if x._1 == 0 => decode(xs)
    case x :: xs => x._2 +: decode((x._1 - 1, x._2) +: xs)
    case Nil => Nil
  }