//5. How do you compute the average of an Array[Double]?

def calculateAverage(array:Array[Double])={

  var average = array.sum/array.length
  average

}

calculateAverage(Array(2.4,2.5,12.6))