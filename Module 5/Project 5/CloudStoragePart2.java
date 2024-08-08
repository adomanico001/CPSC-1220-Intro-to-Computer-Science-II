
public class CloudStoragePart2 {
   public static void main(String[] args)  {
      if (args.length > 0) {
         String filenamein = args[0];
         CloudStorageList listobject1 = new CloudStorageList();
         listobject1.readFile(filenamein);
         String report1 = listobject1.generateReport();
         String report2 = listobject1.generateReportByName();
         String report3 = listobject1.generateReportByMonthlyCost();
         
         System.out.print(report1 + report2 + report3);
      }
      
      else {
         System.out.print("File name expected as command line argument."
            + "\nProgram ending." + "\n");
      }
   }
}