import java.text.DecimalFormat;

/**
 * Instantiates class CloudStorage.
 *
 */
public abstract class CloudStorage implements Comparable<CloudStorage> {
   protected String name;
   protected double baseStorageCost;
   
   protected static int count;
   
   /**
    * Constructor.
    * @param nameIn - string
    * @param baseStorageCostIn - double
    */
   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }
   
   /**
    * Method to get name.
    * @return name
    */
   public String getName() {
      return name;
   }
   /** Method to set name.
    * @param nameIn - string
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
    /**
     * Method to get basestoragecost.
     * @return baseStorageCost
     */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
   
   /**
    * Method to set baseStorageCost.
    * @param baseStorageCostIn - double
    */
   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }
   
   /**
    * Method to get count.
    * @return count
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Method to reset count.
    */
   public static void resetCount() {
      count = 0;
   }
   /** 
    * Method for string description.
    * @return output
    */
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      
      String output = name + " (" + this.getClass() + ")"
         + " Monthly Cost: "
         + costFormat.format(monthlyCost()) + "\n"
         + "Base Storage Cost: "
         + costFormat.format(getBaseStorageCost());
         
      return output;
   }
   /**
    * Method for double monthlyCost.
    * @return none
    */
   public abstract double monthlyCost();
   
   /**
    * Compare To method.
    * @param o - CloudStorage
    * @return name
    */
   public int compareTo(CloudStorage o) {
      return name.compareToIgnoreCase(o.name);
   }
}