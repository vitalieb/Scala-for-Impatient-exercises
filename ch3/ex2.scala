//Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4,
//  5) becomes Array(2, 1, 4, 3, 5).


def swapAdjacent(array: Array[Int]) = {
  for (i <- array.indices if i%2==0) {
    val temp = array(i)
    if (i + 1 < array.length) {
      array(i) = array(i + 1)
      array(i+1) = temp
    }
  }
  array
}

swapAdjacent(Array(1, 2, 3, 4, 5))
swapAdjacent(Array(4, 5, 6, 7))
swapAdjacent(Array(7, 8, 9, 10, 11,12))