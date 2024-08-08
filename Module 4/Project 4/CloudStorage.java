
/**
 * Initiates the class representing the Cloud storage.
 */
public abstract class CloudStorage {
  //instance variables:
   protected String name;
   protected double baseStorageCost;
   //class variable:
   protected static int count = 0;
   
   /**
    * Constructor.
    * @param nameIn - String
    * @param baseStorageCostIn - double
    */
   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }
   
   /**
    * Method to get string Name.
    * @return - name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method to set string Name.
    * @param nameIn - String
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Method to get double baseStorageCost.
    * @return - baseStorageCost
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
    * @return - count
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Method to reset the count.
    */
   public static void resetCount() {
      CloudStorage.count = 0;
   }
   
   /**
    * Method to output the monthly cost.
    * @return - output
    */
   public String toString() {
      return getName();
   }
   
   /**
    * Abstract method of monthlyCost.
    * @return - no return
    */
   public abstract double monthlyCost();
   
}
