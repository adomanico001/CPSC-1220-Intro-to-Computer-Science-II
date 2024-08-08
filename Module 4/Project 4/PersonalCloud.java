/**
 * Initiates the class PersonalCloud.
 */
public class PersonalCloud extends SharedCloud {
/**
 * Initiates the cost factor.
 */
   public static final double COST_FACTOR = 3.0;
   
   /**
    * Constructor PersonalCloud.
    * @param nameIn - String
    * @param baseStorageCostIn - double
    * @param dataStoredIn - double
    * @param dataLimitIn - double
    */
   public PersonalCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
   /**
    * Method to get the cost factor.
    * @return - cost factor
    */
   public double getCostFactor() {
      return PersonalCloud.COST_FACTOR;
   }
   
   /**
    * Method to calculate the monthly cost.
    * @return - calculation for the monthly cost
    */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PersonalCloud.COST_FACTOR;
   }
   
}