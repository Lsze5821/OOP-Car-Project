package vehicles;

/**
 * Vehicle Frame implementing the chassis data.
 *
 * @author Louis Sze 12/11/2019
 */
public class VehicleFrame implements Chassis {

  private String vehicleFrameType;

  /**
   * Constructor with single parameter.
   *
   * @param vehicleFrameType passing vehicle frame type as a string
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Default Constructor.
   */
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  /**
   * Gets the data for chassis type.
   *
   * @return returns the chassis type data
   */
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Sets data to be Accessed.
   * @param vehicleFrameType Passing a single string param vehicle frame type
   */
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  public String toString() {
    return "Chassis         : " + chassis + "\n"
        + "Vehicle Frame   : " + vehicleFrameType;
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */

  public static void main(String[] args) {
    VehicleFrame vehicle1 = new VehicleFrame();
    System.out.println(vehicle1);
    VehicleFrame vehicle2 = new VehicleFrame("Ladder Frame");
    System.out.println(vehicle2);
  }

}
