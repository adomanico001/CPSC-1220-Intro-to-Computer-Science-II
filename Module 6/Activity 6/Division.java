/**
 * A simple program that calculates integer division.
 *
 * Module 6 - Activity 6
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/11/2023
 */


/**
 * Instantiates class Division; intDivide divides two integers
 * and returns the value.
 */
public class Division {
   /**
    * intDivide divides two integers and returns the value.
    * @param numIn - sets the numerator
    * @param denomIn - sets the denominator
    * @return - value
    */
   public static int intDivide(int numIn, int denomIn) {
      try {
         int value = numIn / denomIn;
         return value;
      }
      
      catch (ArithmeticException e) {
         return 0;
      }
   }
    
    /**
     * decimalDivide divides two integers and returns a floating point value.
     * @param numIn - sets the numerator
     * @param denomIn - sets the denominator
     * @throws IllegalArgumentException - executes when divided by zero
     * @return - value
     */  
   public static double decimalDivide(int numIn, int denomIn) {
      if (denomIn == 0) {
         throw new IllegalArgumentException("The denominator cannot be"
               + "divided by zero.");
      }
      
      double value = (double) numIn / denomIn;
      return value;
   }
}