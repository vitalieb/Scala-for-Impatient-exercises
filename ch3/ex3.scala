//3. Repeat the preceding assignment, but produce a new array with the swapped values. Use
//for/yield.


def swapAdjacent(array: Array[Int]) = {

  for (i <- array.indices) yield
    if (i == 0 || (i % 2 == 0 && (i + 1 < array.length))) {
      array(i + 1)
    }
    else if (i == 1 || (i % 2 == 1)) {
      array(i - 1)
    }
    else if (i == array.length - 1) {
      array(i)
    }
}

swapAdjacent(Array(1, 2, 3, 4, 5))
swapAdjacent(Array(4, 5, 6, 7))
swapAdjacent(Array(7, 8, 9, 10, 11, 12))
swapAdjacent(Array(1, 2, 3))