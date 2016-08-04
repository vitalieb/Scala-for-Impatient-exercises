//9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of
//values less than v, equal to v, and greater than v.

def lteqgt(values: Array[Int], v: Int) = {

  var less = 0
  var equal = 0
  var greater = 0

  for (i <- values.indices) {
    if (values(i) == v)
      equal += 1
    else if (values(i) < v)
      less += 1
    else if
    (values(i) > v)
      greater += 1
  }

  var result = (less, equal, greater)
  result

}

lteqgt(Array(4, 6, 1, 8, 3, 3, 2, 1, 4, 62, 2, 4), 3)