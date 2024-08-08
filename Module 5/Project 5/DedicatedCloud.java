import java.text.DecimalFormat;

public class DedicatedCloud extends CloudStorage {
   private double serverCost;
   
   public DedicatedCloud(String nameIn, double baseStorageCostIn, double serverCostIn) {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
   
   public double getServerCost() {
      return serverCost;
   }
   
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   
   public double monthlyCost() {
      return baseStorageCost + serverCost;
   }
   
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
   
      return super.toString() + "\nServer Cost: " 
         + costFormat.format(getServerCost()) + "\n";
   }
}
