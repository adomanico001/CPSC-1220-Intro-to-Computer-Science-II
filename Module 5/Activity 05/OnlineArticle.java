 /**
 * A simple program that represents online article items in a store.
 * Module 5 - Activity 5
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/06/2023
 */

/**
 * Initiates the class representing the online article items.
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * Constructor.
    * @param nameIn - string
    * @param priceIn - double
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
    /**
    * Method that sets the word count.
    * @param wordCountIn - int
    * @return word count
    */
   public int setWordCount(int wordCountIn) {
      return wordCountIn;
   }
}