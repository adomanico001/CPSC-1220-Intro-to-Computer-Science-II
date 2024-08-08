/**
 * Initiates the class representing the Public Cloud.
 */

public class PublicCloud extends SharedCloud {
   /**
    * Initializes the double cost factor.
    */
   public static final double COST_FACTOR = 2.0;
   
   /**
    * Constructor for class PublicCloud.
    * @param nameIn - string
    * @param baseStorageCostIn - double
    * @param dataStoredIn - double
    * @param dataLimitIn - double
    */
   public PublicCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /** 
    * Method to access the cost factor.
    * @return - public cloud cost factor
    */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
    * Method for monthlyCost.
    * @return - calculation for monthly cost
    */
   public double monthlyCost() {
      return getBaseStorageCost() + dataOverage() * PublicCloud.COST_FACTOR;
   }
}