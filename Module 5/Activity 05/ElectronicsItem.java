/**
 * A simple program that represents electronics items in a store.
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/02023
 */

/**
 * Initiates the class representing the electronics items.
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   
   /**
    * Method to initialize the shipping cost.
    */
   public static final double SHIPPING_COST = 1.5;
   
    /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    * @param weightIn - double weight
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   
   /**
    * Method to calculate the item cost.
    * @return - price calculation
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
}