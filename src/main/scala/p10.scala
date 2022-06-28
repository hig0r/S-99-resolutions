def encode[A](xs: List[A]): List[(Int, A)] =
  pack(xs).map(x => (x.length, x.head))