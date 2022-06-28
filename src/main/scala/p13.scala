def encodeDirect[A](xs: List[A]): List[(Int, A)] =
  if xs.isEmpty then Nil
  else
    val (xs1, xs2) = xs.span(x => x == xs.head)
    (xs1.length, xs1.head) +: encodeDirect(xs2)