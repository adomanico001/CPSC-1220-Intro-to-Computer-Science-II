public class Customer implements Comparable<Customer> {
   String name;
   String location;
   double balance;
   
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   public void changeBalance(double amount) {
      balance = getBalance() + amount;
   }
   
   public String getLocation() {
      return location;
   }
   
   public double getBalance() {
      return balance;
   }
   
   public String toString() {
      String output = name + "\n";
      output += location + "\n";
      output += "$" + balance;
      return output;
   }
   
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