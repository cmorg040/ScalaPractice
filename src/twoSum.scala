object twoSum extends App {
  var target = 22

  var nums = Array(1, 2, 3, 5, 9, 13)

  for (x <- nums) {
    if (x <= target) {
      for (y <- nums) {
        if (x + y == target) {
          println(x + " + " + y + " = " + target)
        }
      }
    }
  }
}
