/** Instantiates class PersonalCloud. */

public class PersonalCloud extends SharedCloud {
/** Method for cost factor. */
   public static final double COST_FACTOR = 3.0;
   /** Constructor.
    * @param nameIn - string
    * @param baseStorageCostIn - double
    * @param dataStoredIn - double
    * @param dataLimitIn - double
    */
   
   public PersonalCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   /** Method to get cost factor.
    * @return cost factor */
   public double getCostFactor() {
      return PersonalCloud.COST_FACTOR;
   }
   /** Method for monthlyCost.
   @return calculation */
   public double monthlyCost() {
      return getBaseStorageCost() + dataOverage() * PersonalCloud.COST_FACTOR;
   }
}