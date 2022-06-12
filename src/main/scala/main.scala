@main def main(): Unit =
  println(last(List(1, 1, 2, 3, 5, 8)))
  println(penultimate(List(1, 1, 2, 3, 5, 8)))
  println(nth(2, List(1, 1, 2, 3, 5, 8)))
  println(length(List(1, 1, 2, 3, 5, 8)))
  println(reverse(List(1, 1, 2, 3, 5, 8)))
  println(isPalindrome(List(1, 2, 3, 2, 1)))
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))