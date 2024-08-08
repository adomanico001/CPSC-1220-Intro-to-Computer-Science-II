/**
 * A simple program that represents inventory items in a store.
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/29/2023
 */

/**
 * Initiates the class representing the inventory items.
 */
public class InventoryItem {
   protected String name;
   protected double price;
   //class variable:
   private static double taxRate = 0;
   
   /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    */
   
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Method to access String name.
    * @return - name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method to calculate the item cost.
    * @return - price
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Method to set the tax rate.
    * @param taxRateIn - double 
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Method for item description.
    * @return - name and final item cost
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
      
}