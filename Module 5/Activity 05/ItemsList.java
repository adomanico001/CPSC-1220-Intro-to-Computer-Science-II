/**
 * A program that introduces polymorphism through the use of inventory items.
 *
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/06/2023
 */
 
 /**
  * Initializes class ItemsList.
  */
public class ItemsList {
   //instance variable:
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Constructor.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
    * Method to add item into inventory.
    * @param itemIn - inventory item
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * Method for output description.
    * @return output
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += this.inventory[i] + "\n";
      }
      
      return output;
   }
   
   /**
    * Method to calculate the total in electronics.
    * @param electronicsSurcharge - double
    * @return - total
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
}
