import java.text.DecimalFormat;

/**
 * Instantiates class SharedCloud.
 */
public class SharedCloud extends CloudStorage {
   protected double dataStored;
   protected double dataLimit;
   
   /**
    * Initalizes the cost factor.
    */
   public static final double COST_FACTOR = 1.0;
   
   /**
    * Constructor.
    * @param nameIn - string
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
    * Method to get dataStored.
    * @return dataStored
    */
   public double getDataStored() {
      return dataStored;
   }
   
   /**
    * Method to set dataStored.
    * @param dataStoredIn - double
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
    
    /**
     * Method to get dataLimit.
     * @return dataLimit
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
     * Method to get cost factor.
     * @return cost factor
     */
   public double getCostFactor() {
      return SharedCloud.COST_FACTOR;
   }
    /**
     * Method for monthly cost.
     * @return cost
     */
   public double monthlyCost() {
      double cost = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
    /**
     * Method for data overage.
     * @return value
     */
   public double dataOverage() {
      double value = dataStored - dataLimit;
      if (value > 0) {
         return value;
      }
      
      return 0;
   }
   
   /**
    * String description.
    * @return output
    */
   public String toString() {
   
      DecimalFormat decimalFormat = new DecimalFormat("0.000");
   
      String output = super.toString();
      
      output += "\nData Stored: " + decimalFormat.format(getDataStored())
         + " GB"
         + "\nData Limit: " + decimalFormat.format(getDataLimit()) + " GB"
         + "\nOverage: " + decimalFormat.format(dataOverage()) + " GB"
         + "\nCost Factor: " + getCostFactor() + "\n";
         
      return output;
   }
}