package vehicles;

/**
 * Public interface chassis implemented by other classes.
 *
 * @author Louis Sze 12/11/19
 */
public interface Chassis {

  public String chassis = "Chassis";

  public Chassis getChassisType();

  public void setChassisType(String vehicleChassis);


}
