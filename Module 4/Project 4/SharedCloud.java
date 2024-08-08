
/**
 * Initiates the class SharedCloud.
 */
public class SharedCloud extends CloudStorage {
   protected double dataStored;
   protected double dataLimit;
   
   /**
    * Double for cost factor.
    */
   public static final double COST_FACTOR = 1.0;
   
   /**
    * Constructor SharedCloud.
    * @param nameIn - String
    * @param baseStorageCostIn - double
    * @param dataStoredIn - double
    * @param dataLimitIn - double
    */
   public SharedCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;
   }
   
   /**
    * Method to get the scored data.
    * @return - dataStored
    */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
    * Method to set dataScored.
    * @param dataStoredIn - doubble
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   
   /**
    * Method to get dataLimit.
    * @return - dataLimit
    */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
    * Method to set dataLimit.
    * @param dataLimitIn - double
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
    * Method to get costFactor.
    * @return - cost factor
    */
   public static double getCostFactor() {
      return COST_FACTOR;
   }
   
   /**
    * Boolean for value calculation.
    * @return - true/false depending on calculation
    */
   public double dataOverage() {
      double value = dataStored - dataLimit;
      if (value > 0) {
         return value;
      }
      
      return 0;
   }
   
   /**
    * Method for monthly costs.
    * @return - calculated cost
    */
   public double monthlyCost() {
      double cost = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
   
   /**
    * Description for output.
    * @return - output
    */
   public String toString() {
      return super.toString() + " (class SharedCloud) Monthly Cost: $" + monthlyCost()
         + "\nBase Storage Cost: $" + getBaseStorageCost()
         + "\nData Stored: " + getDataStored() + " GB"
         + "\nData Limit: " + getDataLimit() + " GB"
         + "\nOverage: " + dataOverage() + " GB"
         + "\nCost Factor: " + SharedCloud.COST_FACTOR + "\n";
   } 
}
