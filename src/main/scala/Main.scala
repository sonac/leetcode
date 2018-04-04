object Main extends App {
  val twoSum = easy.TwoSum.solution(Array(3, 2, 4), 6)
  val revInt = easy.ReverseInt.solution(1534236469)
  print("twoSum result is: "); twoSum.foreach(print(_)); print("\n")
  println("revInt result is: " + revInt)
}
