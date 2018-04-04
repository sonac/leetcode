package easy

object ReverseInt {
  def solution(x: Int): Int = {
    val res = if (x < 0) {
      x.toString.substring(1).reverse.toLong * -1
    }
    else {
      x.toString.reverse.toLong
    }
    if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
      0
    }
    else {
      res.toInt
    }
  }
}
