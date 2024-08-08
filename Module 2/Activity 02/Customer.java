/**
 * A program that practices implementing interfaces and overloads methods.
 * Module 2 - Activity 2
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 3/13/2023
 */

/**
 * The class Customer.
 */
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;
   
   /**
    * Instantiates a new customer.
    * @param nameIn - String
    */
   
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * Mutator that sets the location.
    * @param locationIn - String
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * Mutator that sets the location, specifically city and state.
    * @param city - String
    * @param state - String
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    * Method to change the balance.
    * @param amount - double
    */
   public void changeBalance(double amount) {
      balance = getBalance() + amount;
   }
   
   /**
    * Accessor - accesses getLocation.
    * @return - location
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * Mutator that sets the balance.
    * @return - balance
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Method toString.
    * @return - output
    */
   public String toString() {
      String output = name + "\n";
      output += location + "\n";
      output += "$" + balance;
      return output;
   }
   
   /**
    * Method for comparing customer objects.
    * @param obj - customer object
    * @return - values
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 1;
      }
   }
}