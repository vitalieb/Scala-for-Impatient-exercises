//4. Reimplement the Time class from the preceding exercise so that the internal representation is the
//  number of minutes since midnight (between 0 and 24 × 60 – 1). Do not change the public
//interface. That is, client code should be unaffected by your change.

class Time(val hours: Int, val minutes: Int) {

  def before(other: Time): Boolean = {

    if ((this.hours * 60 * 60 + this.minutes * 60) < (other.hours * 60 * 60 + other.minutes * 60)) {
      true
    }
    else if ((this.hours * 60 * 60 + this.minutes * 60) == (other.hours * 60 * 60 + other.minutes * 60)) {
      false
    }
    else
      false
  }

}

val time1 = new Time(6, 15)
val time2 = new Time(6, 15)

time1.before(time2)