package vehicles;

import java.util.Date;

/**
 * Vehicle class that implements the engine and chassis calling its data.
 *
 * @author Louis Sze 12/11/2019
 */
public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  /**
   * Default constructor for vehicle when no parameter passed through default generic data.
   */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleType = "Null";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("Generic");
    this.vehicleEngine.setDriveTrain("Generic");
  }

  /**
   * This is the constructor that create objects passing certain parameters.
   *
   * @param vehicleManufacturer     String Manufacturer
   * @param vehicleManufacturedDate Manufacture Date
   * @param vehicleMake             String vehicle make
   * @param vehicleModel            String vehicle type
   * @param vehicleType             String vehicle type
   * @param vehicleFrame            Chassis Data  passed through
   * @param vehicleEngine           Engine Data passed through
   */
  public Vehicle(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, String vehicleType, Chassis vehicleFrame, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleType = vehicleType;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = vehicleEngine;
  }

  /**
   * Sets the data to be accessed.
   *
   * @param engineCylinders passing the engine cylinders as int
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  /**
   * Sets the data to be accessed.
   *
   * @param date passing date for vehicle manufactured date
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleManufacturedDate = date;
  }

  /**
   * Sets the data to be accessed.
   *
   * @param manufacturer passing a string manufacturer
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  /**
   * Sets the data to be accessed.
   *
   * @param engineMake passing engine make as a string
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * Sets the data to be accessed.
   *
   * @param engineModel passing the engine model string
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * Sets the data to be accessed
   *
   * @param driveTrain passing drive train as a string
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * Sets the data to be accessed
   *
   * @param engineType passing the engine type as a string
   */
  @Override
  public void setEngineType(String engineType) {
    this.vehicleEngine.setEngineType(engineType);
  }

  /**
   * gets the the data Chassis type.
   *
   * @return return data vehicle frame
   */
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * Sets the data to be accessed.
   *
   * @param vehicleChassis passing vehicle chasses as a string
   */
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
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
        + vehicleEngine.toString();
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    Vehicle vehicle1 = new Vehicle();
    System.out.println(vehicle1);
    Vehicle vehicle2 = new Vehicle("Honda", new Date(), "Honda", "Prelude", "Null",
        new VehicleChassis("UniBody"),
        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4,
            "88 AKI"));
    System.out.println(vehicle2);
  }
}

