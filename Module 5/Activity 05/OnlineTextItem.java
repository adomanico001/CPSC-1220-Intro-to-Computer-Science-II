 /**
 * A simple program that represents online text items in a store.
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/06/2023
 */

/**
 * Initiates the class representing the online text items.
 */
public abstract class OnlineTextItem extends InventoryItem {
 /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
    * Method that calculates the total item cost.
    * @return - price
    */
   public double calculateCost() {
      return price;
   }
}