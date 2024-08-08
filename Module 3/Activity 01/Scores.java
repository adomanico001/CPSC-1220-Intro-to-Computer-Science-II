/**
 * A simple program that allows the user to interact with a series of scores.
 *
 * Module 3 - Activity 03
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/23/23
 */
 
 /**
  * Class Scores.
  */    
public class Scores {
   private int[] numbers; //instance variable
   
   /**
    * Constructor Scores.
    * @param numbersIn - array
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
    * Method findEvens.
    * @return - returns the even scores
    */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
    * Method findOdds.
    * @return - returns odd-numbered scores
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
    * Method calculateAverage.
    * @return - returns the sum / numbers.length
    */
   public double calculateAverage() {
      double sum = 0.0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return sum / numbers.length;
   }
   
   /**
    * Method string.
    * @return - returns the string result
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
    /**
     * Method String.
     * @return - returns the string in reverse order
     */  
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}