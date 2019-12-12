package vehicles;

/**
 * Vehicle Chassis that implements chassis using its info.
 *
 * @author Louis Sze 12/11/2019
 */
public class VehicleChassis implements Chassis {

  private String chassisName;

  /**
   * Default Constructor.
   */
  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }

  /**
   * Constructor with single parameter.
   *
   * @param chassisName String chassis name
   */
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  /**
   * gets data from the chassis class.
   *
   * @return returns the chassis type
   */
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Set data to be accessed.
   *
   * @param vehicleChassis single parameter vehicle chasis
   */
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  public String toString() {
    return "Chassis: " + chassisName;
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    VehicleChassis vehicle1 = new VehicleChassis();
    System.out.println(vehicle1);
    VehicleChassis vehicle2 = new VehicleChassis("Test Chassis");
    System.out.println(vehicle2);
  }
}

