def generateRandom(n:Int):Array[Int]={
  var a:Array[Int] = (for(i<-0 until n) yield scala.util.Random.nextInt(n-1)).toArray
  a
}

generateRandom(10)