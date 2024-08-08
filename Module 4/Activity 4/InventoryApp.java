 /**pr
 * A simple program that prints the collective items in a store.
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/29/2023
 */

/**
 * Initiates the class representing all of the inventory items.
 */
public class InventoryApp {
   /**
    * Class for main method.
    * @param args - Standard command line arguments
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L.G. Jones");
      
      System.out.println(item1 + "\n\n" + item2 + "\n\n" + item3 
         + "\n\n" + item4);  
   }
}