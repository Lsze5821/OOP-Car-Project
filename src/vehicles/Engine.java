package vehicles;

import java.util.Date;

/**
 * Interface engine containing the sets for data to be implemented by other classes.
 *
 * @author Louis Sze 12/11/2019
 */
public interface Engine {

  public void setEngineCylinders(int engineCylinders);

  public void setEngineManufacturedDate(Date date);

  public void setEngineManufacturer(String manufacturer);

  public void setEngineMake(String engineMake);

  public void setEngineModel(String engineModel);

  public void setDriveTrain(String driveTrain);

  public void setEngineType(String fuel);
}
