 /**
 * A simple program that represents online book items in a store.
 * Module 4 - Activity 4
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/29/2023
 */

/**
 * Initiates the class representing the online book items.
 */
public class OnlineBook extends OnlineTextItem {
   private String author;
   
    /**
    * Constructor.
    * @param nameIn - String name
    * @param priceIn - double price
    */
   public OnlineBook() {
      super();
      this.author = "";
   }
   
   public OnlineBook(String name, double price) {
      super(name, price);
      this.author = "";
   }
   
   /**
    * Method to set the author's name.
    * @param authorIn - string
    */
   public String getAuthor() {
      return author;
   }
   
   public void setAuthor(String author) {
      this.author = author;
   }
   
   /**
    * Method for item description.
    * @return - name, author, and price
    */
   public String toString() {
      String auth;
      if(this.author.equals("")) {
         auth = "Author Not Listed";
      }
      
      else {
         auth = this.author;
         return(getName() + " - " + auth + ": $" + String.format("%.2f", getPrice()));
      }
   }
}