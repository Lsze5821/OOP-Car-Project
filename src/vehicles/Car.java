package vehicles;

import java.util.Date;

/**
 * This is car class that extends vehicle to access its data.
 *
 * @author Louis Sze 12/11/2019
 */
public class Car extends Vehicle {

  //creating an array and car Axle
  private Feature[] feature = new Feature[10];
  private int carAxle;

  /**
   * This is a generic constructor that with no parameter given it defaults to generics.
   */
  public Car() {
    super();
    //array f
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = f;
    this.carAxle = 2;
  }

  /**
   * This is the constructor that create objects passing certain parameters.
   *
   * @param vehicleManufacturer     String of the vehicle manufacturer.
   * @param vehicleManufacturerDate util date of the manufacturer date.
   * @param vehicleMake             String vehicle Make.
   * @param vehicleModel            String vehicle Model.
   * @param vehicleType             String vehicle Type.
   * @param vehicleFrame            Chassis calls the Data from Chassis class.
   * @param vehicleEngine           Engine vehicle calls the Data from Engine class.
   * @param f                       Array of features
   * @param carAxle                 Car Axles
   */
  public Car(String vehicleManufacturer, Date vehicleManufacturerDate, String vehicleMake,
      String vehicleModel, String vehicleType, Chassis vehicleFrame, Engine vehicleEngine,
      Feature[] f, int carAxle) {
    super(vehicleManufacturer, vehicleManufacturerDate, vehicleMake, vehicleModel, vehicleType,
        vehicleFrame, vehicleEngine);
    this.feature = f;
    this.carAxle = carAxle;
  }

  /**
   * Exterior Features of the car.
   *
   * @return the data for the Exterior features.
   */
  public String getExteriorFeatures() {
    System.out.println("Exterior");
    String extFeature = "";
    // Checks the features in a list, checks if its a exterior feature
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (extFeature.length() == 0) {
          extFeature += this.feature[i];
        } else {
          extFeature += "\n                    : " + this.feature[i];
        }
      }
    }
    return extFeature;
  }

  /**
   * Interior Feature of the car.
   *
   * @return the data for the Interior features.
   */
  public String getInteriorFeatures() {
    String intFeature = "";
    // Checks the features in a list, checks if its a interior feature
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        //checks if the
        if (intFeature.length() == 0) {
          intFeature += this.feature[i];
        } else {
          intFeature += "\n                    : " + this.feature[i];
        }
      }
    }
    return intFeature;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  public String toString() {
    return "Manufacturer Name   : " + vehicleManufacturer + "\n"
        + "Manufactured Date   : " + vehicleManufacturedDate + "\n"
        + "Vehicle Make        : " + vehicleMake + "\n"
        + "Vehicle Model       : " + vehicleModel + "\n"
        + "Vehicle Type        : " + vehicleType + "\n"
        + vehicleEngine.toString() + "\n"
        + "Features            : "
        + getExteriorFeatures() + "\n"
        + "                    : "
        + getInteriorFeatures() + "\n"
        + "Car Axel            : "
        + carAxle;

  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println(car1);
    Feature[] f = {new InteriorFeature("AM/FM Radio"),
        new ExteriorFeature("Wood Panels"),
        new InteriorFeature("Air Conditioning"),
        new ExteriorFeature("Moonroof")

    };
    Car car2 = new Car("Honda", new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4,
            "88 AKI"), f, 2);
    System.out.println(car2);
  }
}
