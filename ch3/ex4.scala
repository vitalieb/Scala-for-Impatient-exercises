//4. Given an array of integers, produce a new array that contains all positive values of the original
//array, in their original order, followed by all values that are zero or negative, in their original
//order.

def sortArray(originalArray: Array[Int]) = {
  var arrayOfPositives: Array[Int] =
    (for (i <- originalArray.indices if originalArray(i)>=0) yield originalArray(i)).toArray


  var arrayOfNegatives: Array[Int] =
    (for (i <- originalArray.indices if originalArray(i)<0) yield originalArray(i)).toArray

  var finalArray:Array[Int] = arrayOfPositives ++ arrayOfNegatives

  finalArray

}

sortArray(Array(-1, 2,3,4, -10, 0, -12))
sortArray(Array(-2, 8, 0, 4, -8, -1, 0, 9))