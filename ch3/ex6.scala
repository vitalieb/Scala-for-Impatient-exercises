//6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
//  How do you do the same with an ArrayBuffer[Int]?

import scala.collection.mutable.ArrayBuffer

// 1st way
Array(9, 6, 2, 0, -1, -4, -6).sorted.reverse
ArrayBuffer[Int](9, 6, 2, 0, -1, -4, -6).sorted.reverse

// 2nd way
Array(9, 6, 2, 0, -1, -4, -6).sortWith(_ > _)
ArrayBuffer[Int](9, 6, 2, 0, -1, -4, -6).sortWith(_ > _)