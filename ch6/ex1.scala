//1. Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.

object Conversions {

  def inchesToCentimeters(inches: Double): Double = {
    inches * 2.54
  }


  def gallonsToLiters(gallons: Double): Double = {
    gallons * 3.785411784
  }

  def milesToKilometers(miles: Double): Double = {
    miles * 1.6
  }

}

println("Converting 30 inches to centimeters:")
println(Conversions.inchesToCentimeters(30))

println("Converting 30 gallons to liters:")
println(Conversions.gallonsToLiters(30))

println("Converting 30 miles to kilometers:")
println(Conversions.milesToKilometers(30))