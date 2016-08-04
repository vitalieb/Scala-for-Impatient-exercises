//6. Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for the other
//  weekdays. Demonstrate that the elements are visited in insertion order.

import java.util.Calendar._

val days = scala.collection.mutable.LinkedHashMap(
  "MONDAY" -> MONDAY,
  "TUESDAY" -> TUESDAY,
  "WEDNESDAY" -> WEDNESDAY,
  "THURSDAY" -> THURSDAY,
  "FRIDAY" -> FRIDAY,
  "SATURDAY" -> SATURDAY,
  "SUNDAY" -> SUNDAY
)

print(days)