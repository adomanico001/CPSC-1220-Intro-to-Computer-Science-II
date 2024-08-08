 /**
 * A simple program that represents online book items in a store.
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/06/2023
 */

/**
 * Initiates the class representing the online book items.
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
    /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * Method for output description.
    * @return output
    */
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
     /**
    * Method to set the author's name.
    * @param authorIn - string
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}
   
