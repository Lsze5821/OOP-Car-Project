package vehicles;

/**
 * Interior Feature implements features.
 *
 * @author Louis Sze 12/11/2019
 */
public class InteriorFeature implements Feature {

  private String interiorFeature;

  /**
   * Constructor for zero parameter passing the data as generic
   */
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * Constructor with one parameter
   *
   * @param interiorFeature passing String interior feature
   */
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return this.interiorFeature;
  }

  /**
   * set feature data to be called
   *
   * @param feature setting as a string
   */
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * To String method that converts all the data as a string and displays where ever called.
   *
   * @return retuning the data for the the parameters of the constructor
   */
  @Override
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  /**
   * main method that creates a instance of the class and tests the data.
   *
   * @param args array that stores arguments passing through
   */
  public static void main(String[] args) {
    InteriorFeature intFeature1 = new InteriorFeature();
    System.out.println(intFeature1);
    InteriorFeature intFeature2 = new InteriorFeature("Climate Control");
    System.out.println(intFeature2);
  }
}
