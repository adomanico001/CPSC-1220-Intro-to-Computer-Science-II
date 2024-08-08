 /**
 * A simple program that represents online article items in a store.
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/29/2023
 */

/**
 * Initiates the class representing the online article items.
 */
public class OnlineArticle extends InventoryItem {
   
   public OnlineArticle() {
      super();
   }
   
   /**
    * Constructor.
    * @param nameIn - string
    * @param priceIn - double
    */
   public OnlineArticle(String name, double price) {
      super(name, price);
   }
   
   
   /**
    * Method that sets the word count.
    * @param wordCountIn - int
    */
   public String toString() {
      return (getName() + ": $" + String.format("%.2f", getPrice()));
   }
}