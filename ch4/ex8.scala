//8. Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest
//  values in the array

def minmax(values: Array[Int]) = {

  val tuple = (values.min,values.max)
  tuple

}


minmax(Array(4,5,1,7,9,13))