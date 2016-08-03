//8. Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 32. Collect
//  indexes of the negative elements, reverse the sequence, drop the last index, and call a.remove(i)
//for each index. Compare the efficiency of this approach with the two approaches in Section 3.4.

import scala.collection.mutable.ArrayBuffer

val a = ArrayBuffer(2, 3, -7, 5, -10, 7, 11)

(for (i <- a.indices if a(i) < 0) yield i).reverse.dropRight(1).foreach(a.remove(_))

a

