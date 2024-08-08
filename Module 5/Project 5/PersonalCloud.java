public class PersonalCloud extends SharedCloud {
   public static final double COST_FACTOR = 3.0;
   
   public PersonalCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   }
   
   public double getCostFactor() {
      return PersonalCloud.COST_FACTOR;
   }
   
   public double monthlyCost() {
      return getBaseStorageCost() + dataOverage() * PersonalCloud.COST_FACTOR;
   }
}