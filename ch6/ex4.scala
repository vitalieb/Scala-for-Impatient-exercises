//4. Define a Point class with a companion object so that you can construct Point instances as Point(3,
//  4), without using new.

class Point(x: Int, y: Int) {
  override def toString: String = x + " | " + y
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

val point = Point(4, 5)

point