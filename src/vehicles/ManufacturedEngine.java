package vehicles;

import java.util.Date;

/**
 * Manufacturer engine implements Engine with the containing data containing engine data.
 *
 * @author Louis Sze 12/11/2019
 */
public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   * Default constructor when no parameter is passed all the data is generic default data.
   */
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drive";
  }

  /**
   * This is the constructor that create objects passing certain parameters.
   *
   * @param engineManufacturer     String engine Manufacturer
   * @param engineManufacturedDate Manufacturer date
   * @param engineMake             String of engine Make
   * @param engineModel            String engine Model
   * @param driveTrain             String of drive train
   * @param engineCylinders        Int number of cylinder
   * @param engineType             String engine type
   */
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String driveTrain, int engineCylinders,
      String engineType) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /**
   * Gets for Engine Manufacturer as a string.
   *
   * @return engine manufacturer
   */
  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  /**
   * Sets getting data passing through param.
   *
   * @param engineManufacturer String engine manufacturer
   */
  @Override
  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  /**
   * Gets to access the date.
   *
   * @return The date of engine manufacturer date
   */
  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  /**
   * sets the data of Engine Manufacturer Date.
   *
   * @param engineManufacturedDate passing the date of the engine manufacturer date
   */
  @Override
  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  /**
   * get to access the engine make data.
   *
   * @return the engine make
   */
  public String getEngineMake() {
    return engineMake;
  }

  /**
   * Sets setting the variable of engine make.
   *
   * @param engineMake passing String engine make
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * gets to access the engine model.
   *
   * @return the engine model
   */
  public String getEngineModel() {
    return engineModel;
  }

  /**
   * sets to assign data to be access.
   *
   * @param engineModel passing the String engine Model
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * gets to access the engine cylinders.
   *
   * @return the engine cylinder as a int
   */
  public int getEngineCylinders() {
    return engineCylinders;
  }

  /**
   * Set assign data to be accessed.
   *
   * @param engineCylinders passing int number of engine cylinders
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * Gets to access the engine type.
   *
   * @return the engine type
   */
  public String getEngineType() {
    return engineType;
  }

  /**
   * Set data to be accessed.
   *
   * @param engineType passing engine type data as a string
   */
  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  /**
   * gets to access the data.
   *
   * @return the drive train
   */
  public String getDriveTrain() {
    return driveTrain;
  }

  /**
   * sets data to be accessed.
   *
   * @param driveTrain passing the drive train data as string
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n"
        + "Engine Manufactured : " + engineManufacturedDate + "\n"
        + "Engine Make         : " + engineMake + "\n"
        + "Engine Model        : " + engineModel + "\n"
        + "Engine Type         : " + engineType + "\n"
        + "Engine Cylinders    : " + engineCylinders + "\n"
        + "Drive Train         : " + driveTrain;
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    ManufacturedEngine engine1 = new ManufacturedEngine();
    System.out.println(engine1);
    ManufacturedEngine engine2 = new ManufacturedEngine("Honda", new Date(1325599999999L),
        "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI");
    System.out.println(engine2);
  }
}
