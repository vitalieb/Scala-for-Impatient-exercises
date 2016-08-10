//2. The preceding problem wasn’t very object-oriented. Provide a general superclass UnitConversion
//and define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.

abstract class UnitConversion {
  def convert(parameter: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(inches: Double): Double = {
    inches * 2.54
  }
}

object GallonsToLiters extends UnitConversion {
  override def convert(gallons: Double): Double = {
    gallons * 3.785411784
  }
}

object MilesToKilometers extends UnitConversion {
  override def convert(miles: Double): Double = {
    miles * 1.6
  }
}

println("Converting 30 inches to centimeters:")
println(InchesToCentimeters.convert(30))

println("Converting 30 gallons to liters:")
println(GallonsToLiters.convert(30))

println("Converting 30 miles to kilometers:")
println(MilesToKilometers.convert(30))