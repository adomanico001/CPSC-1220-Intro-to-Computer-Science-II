/**
 * A program involving monthly cost and reporting for cloud storage, part 1.
 *
 * Module 6 - Project 6
 * @author Addie Domanico - CPSC 1220 - A01
 * @version 07/02/2023
 */


import java.io.FileNotFoundException;
/** Instantiates class CloudStoragePart3. */
public class CloudStoragePart3 {
/** Constructor.
 * @param args - Command line arguments
 * @throws FileNotFoundException - exception
 */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.print("File name expected as command line argument.");
         System.out.print("\nProgram ending." + "\n");
      }
      else {
         CloudStorageList listObject = new CloudStorageList();
         listObject.readFile(args[0]);
         System.out.print(listObject.generateReport());
         System.out.print(listObject.generateReportByName());
         System.out.print(listObject.generateReportByMonthlyCost());
      }
   }
}