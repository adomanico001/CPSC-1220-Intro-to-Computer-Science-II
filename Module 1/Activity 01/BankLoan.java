/**
 * A simple program that utilizes static variables.
 *
 * Module 1 Activity 1
 * @author Addie Domanico - CPSC 1220 - AO1
 * @version 3/8/2023
 */


/**
* Main class BankLoan.
*
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   
   //class variable
   private static int loansCreated = 0;
   
   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

/**
 * Constructor.
 * @param customerNameIn - String
 * @param interestRateIn - double for interest rate input
 */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
    * Boolean.
    * @param amount - double
    * @return - returns amount greater or equal to zero 
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
   /**
    * Boolean.
    * @param loan - Bank loan
    * @return - returns true or false accordingly
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   /**
    * Accessor.
    * @return - returns the loans created
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * Used to reset the loans created.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
   /**
    * Boolean.
    * @param amount - amount borrowed from the bank
    * @return - returns if a loan was made
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

    /**
     * Method used for balance to pay the bank.
     * @param amountPaid - used for the amount paid to bank
     * @return - returns new balance
     */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
    /**
     * Accessor.
     * @return - returns the balance
     */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Mutator.
    * @param interestRateIn - sets the interest rate
    * @return - returns true or false accordingly
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Accessor.
    * @return - returns the interest rate
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Method for the interest charged.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Method for string output.
    * @return - retutrns the output
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
