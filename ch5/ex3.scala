//3. Write a class Time with read-only properties hours and minutes and a method before(other: Time):
//  Boolean that checks whether this time comes before the other. A Time object should be constructed
//  as new Time(hrs, min), where hrs is in military time format (between 0 and 23).

class Time(val hours: Int, val minutes: Int) {

  def before(other: Time): Boolean = {
    if (this.hours < other.hours || this.hours == other.hours) {
      if (this.minutes < other.minutes)
        true
      else
        false
    }
    else
      false
  }

}

val time1 = new Time(12,14)
val time2 = new Time(6,15)

time1.before(time2)