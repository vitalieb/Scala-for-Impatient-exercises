//1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n
//(exclusive).

def generateRandom(n: Int) = {
  for (i <- 0 until n) yield scala.util.Random.nextInt(n - 1)
}

val a = generateRandom(15).toArray