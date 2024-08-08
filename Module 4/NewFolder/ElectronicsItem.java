/**publi
 * A simple program that represents electronics items in a store.
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/29/2023
 */

/**
 * Initiates the class representing the electronics items.
 */
public class ElectronicsItem extends InventoryItem {
   private int weight;
   
   public ElectronicsItem() {
      super();
      this.weight = 0;
   }
   
    /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    * @param weightIn - double weight
    */
   public ElectronicsItem(String name, double price, int weight) {
      super(name, price);
      this.weight = weight;
   }
   
   public int getWeight() {
      return weight;
   }
   
   /**
    * Method to set the weight.
    * @param weightIn - double
    */
   public void setWeight(int weight) {
      this.weight = weight;
   }
   
   /**
    * Method to calculate the item cost.
    * @return - price calculation
    */
   public double calculateCost() {
      return(super.calculateCost() + this.weight);
   }
   
   public String toString() {
      return(getName() + ": $" + String.format("%.2f", calculateCost()));
   }
}