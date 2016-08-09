//9. Reimplement the class of the preceding exercise in Java, C#, or C++ (your choice). How much
//  shorter is the Scala class?

class Car{

  private String manufacturer;
  private String model;
  private Integer year;
  private String licenseNr;

  public void setLicenseNr(String licenseNr) {
    this.licenseNr = licenseNr;
  }

  public String getManufacturer() {

    return manufacturer;
  }

  public String getModel() {
    return model;
  }

  public Integer getYear() {
    return year;
  }

  public String getLicenseNr() {
    return licenseNr;
  }

  public Car(String manufacturer, String model) {
    this(manufacturer, model, -1, "ZZZ");
  }

  public Car(String manufacturer, String model, Integer year) {
    this(manufacturer,model,year,"ZZZ");
  }

  public Car(String manufacturer, String model, String licenseNr) {
    this(manufacturer,model,-1,licenseNr);
  }

  public Car(String manufacturer, String model, Integer year, String licenseNr) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.year = year;
    this.licenseNr = licenseNr;
  }

  public static void main(String[] args) {
    Car car = new Car("Ford","Escalade");
    System.out.println(car.getLicenseNr());
  }
}