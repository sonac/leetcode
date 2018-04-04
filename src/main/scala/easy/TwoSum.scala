package easy

object TwoSum {
  def solution(nums: Array[Int], target: Int): Array[Int] = {
    var i = 0
    var k = 0
    var res = Array(0)

    while (i < nums.length) {
      while (k < nums.length) {
        if (i != k && nums(i) + nums(k) == target) {
          res = Array(i) :+ k
          k = nums.length
          i = nums.length
        }
        k += 1
      }
      k = 0
      i += 1
    }
    res
  }
}
