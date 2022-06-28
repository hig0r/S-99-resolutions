def encodeModified[A](xs: List[A]): List[Any] =
  encode(xs).map(x => if x._1 == 1 then x._2 else x)