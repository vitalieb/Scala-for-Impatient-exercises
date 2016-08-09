//8. Make a class Car with read-only properties for manufacturer, model name, and model year, and
//a read-write property for the license plate. Supply four constructors. All require the
//manufacturer and model name. Optionally, model year and license plate can also be specified in
//  the constructor. If not, the model year is set to -1 and the license plate to the empty string. Which
//constructor are you choosing as the primary constructor? Why?

case class Car(manufacturer: String, model: String, year: Int, var licenseNr: String) {

  def this(manufacturer: String, model: String) {
    this(manufacturer, model, -1, "")
  }

  def this(manufacturer: String, model: String, year: Int) {
    this(manufacturer, model, year, "")
  }

  def this(manufacturer: String, model: String, licenseNr: String) {
    this(manufacturer, model, -1, licenseNr)
  }

  //  override def toString: String = {manufacturer+" | "+model+" | "+year+" | "+licenseNr}

}

val car = new Car("Ford", "Escalade", "K VV 132")
car.licenseNr = "K QQ 616"

