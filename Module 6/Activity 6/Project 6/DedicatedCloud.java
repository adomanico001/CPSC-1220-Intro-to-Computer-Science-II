import java.text.DecimalFormat;
/** Instantiates class for DedicatedCloud. */
public class DedicatedCloud extends CloudStorage {
   private double serverCost;
   /** Constructor.
    * @param nameIn - string
    * @param baseStorageCostIn - double
    * @param serverCostIn - double
    */
   public DedicatedCloud(String nameIn,
      double baseStorageCostIn, double serverCostIn) {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
   /** Method to get serverCost.
    * @return serverCost
    */
   public double getServerCost() {
      return serverCost;
   }
   /**
    * Method for set serverCost.
    * @param serverCostIn - double
    */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   /** Method for monthlyCost.
    * @return calculation
    */
   public double monthlyCost() {
      return baseStorageCost + serverCost;
   }
   
   /**
    * String description.
    * @return output
    */
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
   
      return super.toString() + "\nServer Cost: " 
         + costFormat.format(getServerCost()) + "\n";
   }
}
