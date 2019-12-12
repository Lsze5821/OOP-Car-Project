package vehicles;

/**
 * Exterior Feature implements features.
 *
 * @author Louis Sze 12/11/2019
 */
public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  /**
   * Generic constructor setting data to generic if no parameter is passed.
   */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * Constructor with one parameter
   *
   * @param exteriorFeature passing String exterior feature
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Gets the data for exterior feature
   *
   * @return the exterior features
   */
  public String getFeature() {
    return this.exteriorFeature;
  }

  /**
   * set feature data to be called
   *
   * @param feature setting as a string
   */
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  @Override
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    ExteriorFeature extFeature1 = new ExteriorFeature();
    System.out.println(extFeature1);
    ExteriorFeature extFeature2 = new ExteriorFeature("Fog Lamps");
    System.out.println(extFeature2);
  }
}
