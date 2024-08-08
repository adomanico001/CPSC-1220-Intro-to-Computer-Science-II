
/**
 * Initiates the class representing the Dedicated Cloud.
 */
public class DedicatedCloud extends CloudStorage {
   private double serverCost;
   
   /**
    * Constructor.
    * @param nameIn - String
    * @param baseStorageCostIn - double
    * @param serverCostIn - double
    */
   public DedicatedCloud(String nameIn, double baseStorageCostIn, 
      double serverCostIn) {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
    /**
     * Method to access serverCost.
     * @return - serverCost
     */
   public double getServerCost() {
      return serverCost;
   }
    /**
     * Method to set serverCost.
     * @param serverCostIn - double
     */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
    /**
     * Method for monthlyCost.
     * @return - total
     */
   public double monthlyCost() {
      double total = baseStorageCost + serverCost;
      return total;
   }
    /**
     * Method for String output.
     * @return - output
     */
   public String toString() {
      return super.toString() + " (class Dedicated Cloud) Monthly Cost: $" + monthlyCost()
         + "\nBase Storage Cost: $" + getBaseStorageCost()
         + "\nServer Cost: $" + getServerCost() + "\n";
   }
   
}