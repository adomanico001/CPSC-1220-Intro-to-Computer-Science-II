/** Instantiates class CloudStoragePart1. */

public class CloudStoragePart1 {
/** Main method.
* @param args - Command line arguments
*/
   public static void main(String [] args) {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      System.out.println(c1.toString());
      
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      System.out.println(c2.toString());
      
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      System.out.println(c3.toString());
      
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      System.out.println(c4.toString());
   
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      System.out.print(c5.toString());
   }
}