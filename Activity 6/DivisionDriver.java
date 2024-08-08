/**
 * A simple program that throws an exception when the user
 * attempts to divide by zero.
 *
 * Module 6 - Activity 6
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 04/13/2023
 */
 
 /**
  * Import dialog box utility.
  */
import javax.swing.JOptionPane;

/**
 * Instantiates class Division Driver.
 */
public class DivisionDriver {
   /**
    * Main method.
    * @param args - Standard command line arguments.
    */
   public static void main(String[] args) {
      String numInput =
         JOptionPane.showInputDialog("Enter the numerator: ");
      String denomInput =
         JOptionPane.showInputDialog("Enter the denominator: ");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e,
            "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}