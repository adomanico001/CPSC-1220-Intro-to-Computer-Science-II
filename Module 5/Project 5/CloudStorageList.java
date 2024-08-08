import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Instantiates CloudStorageList - providing methods for reading data in files
 * and generating reports. 
 */
public class CloudStorageList {
   //Fields:
   private CloudStorage[] csList;
   private String[] invalidRecords;
   static final char D = 'D';
   static final char C = 'C';
   static final char S = 'S';
   static final char P = 'P';
   
   /**
    * Constructor. Initializes array.
    */
   public CloudStorageList() {
      csList = new CloudStorage[0];
      invalidRecords = new String[0];
   }
   
    /**
     * Method to return array for CloudStorage.
     * @return csList
     */
   public CloudStorage[] getCloudStorageArray() {
      return csList;
   }
    
    /**
     * Method to get invalid records array.
     * @return invalidRecords
     */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   /**
    * Increases the capacity of CloudStorage.
    * @param objIn - initalization
    */
   public void addCloudStorage(CloudStorage cloudObj) {
      csList = Arrays.copyOf(csList, csList.length + 1);
      csList[csList.length - 1] = cloudObj;
   }
   
   /**
    * Increases the capacity for invalid records.
    * @param invalidRecordsIn - initialization
    */
   public void addInvalidRecord(String invalidRecordsIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn;
   }
    
    /**
     * Accepts String data file name.
     * @param dataFile - initialization
     * @throws FileNotFoundException yes
     */
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner fileScanner = new Scanner(new File(fileName));
      
      while (fileScanner.hasNext()) {
         CloudStorage cloudObj;
         String line = fileScanner.nextLine();
         Scanner lineScanner = new Scanner(line);
         lineScanner.useDelimiter(",");
         Character category = Character.toUpperCase(lineScanner.next().charAt(0));
         String name = lineScanner.next();
         double baseStorageCost = Double.parseDouble(lineScanner.next());
         
         switch (category) {
            case 'D':
               double serverCost = Double.parseDouble(lineScanner.next());
               cloudObj =
                  new DedicatedCloud(name, baseStorageCost, serverCost);
               addCloudStorage(cloudObj);
               break;
            
            case 'S':
               double dataStored = Double.parseDouble(lineScanner.next());
               double dataLimit = Double.parseDouble(lineScanner.next());
               cloudObj =
                  new SharedCloud(name, baseStorageCost, dataStored, dataLimit);
               addCloudStorage(cloudObj);
               break;
            
            case 'C':
               dataStored = Double.parseDouble(lineScanner.next());
               dataLimit = Double.parseDouble(lineScanner.next());
               cloudObj =
                  new PublicCloud(name, baseStorageCost, dataStored, dataLimit);
               addCloudStorage(cloudObj);
               break;
            
            case 'P':
               dataStored = Double.parseDouble(lineScanner.next());
               dataLimit = Double.parseDouble(lineScanner.next());
               cloudObj =
                  new PersonalCloud(name, baseStorageCost, dataStored, dataLimit);
               addCloudStorage(cloudObj);
               break;
            
            default:
               addInvalidRecord(line);
               break;
         }
      }
   }
    /**
     * Generates report.
     * @return output
     */  
   public String generateReport() {
      String obs2 = "";
      for (int i = 0; i < csList.length; i++) {
         obs2 += csList[i] + "\n\n";
      }
         
      String report = "-------------------------"
            + "\nMonthly Cloud Storage Report"
            + "\n----------------------------"
            + "\n" + obs2;
      return report;
   }
    /**
     * Generates reports by name.
     * @return output
     */  
   public String generateReportByName() {
      Arrays.sort(getCloudStorageArray());
      String obs = "";
         
      for (int i = 0; i < csList.length; i++) {
         obs += csList[i] + "\n\n";
      }
         
      String namereport = "---------------------------------------"
            + "\nMonthly Cloud Storage Report (by Name)"
            + "\n---------------------------------------"
            + "\n" + obs;
      return namereport;
   }
    /**
     * Generates reports by monthly cost.
     * @return output
     */  
   public String generateReportByMonthlyCost() {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String obs1 = "";
      for (int i = 0; i < csList.length; i++) {
         obs1 += csList[i] + "\n\n";
      }
         
      String costreport = "----------------------------------"
            + "\nMonthly Cloud Storage Report (by Monthly Cost)"
            + "\n------------------------------------"
            + "\n" + obs1;
         
      return costreport;
   }
}