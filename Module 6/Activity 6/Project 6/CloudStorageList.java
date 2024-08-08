import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Instantiates CloudStorageList - providing methods for reading data in files
 * and generating reports. 
 */
public class CloudStorageList {
   //Fields:
   private CloudStorage[] csList;
   private String[] invalidRecords;
   
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
    * @param obj - initalization
    */
   public void addCloudStorage(CloudStorage obj) {
      csList = Arrays.copyOf(csList, csList.length + 1);
      csList[csList.length - 1] = obj;
   }
   
   /**
    * Increases the capacity for invalid records.
    * @param obj - initialization
    */
   public void addInvalidRecord(String obj) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = obj;
   }
    
    /**
     * Accepts String data file name.
     * @param fileNameIn - initialization
     * @throws FileNotFoundException yes
     */
   public void readFile(String fileNameIn) throws FileNotFoundException {
      File file = new File(fileNameIn);
      Scanner fileScanner = new Scanner(file);
      String line = "";
      
      while (fileScanner.hasNextLine()) {
         try {
            CloudStorage cloudObj;
            line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            
            lineScanner.useDelimiter(",");
            
            char type = Character.toUpperCase(lineScanner.next().charAt(0));
            
            String name = lineScanner.next();
            double baseStorageCost = Double.parseDouble(lineScanner.next());
         
            switch (type) {
               case 'D':
                  double serverCost = Double.parseDouble(lineScanner.next());
                  cloudObj = new DedicatedCloud(name,
                     baseStorageCost, serverCost);
                  addCloudStorage(cloudObj);
                  break;
            
               case 'S':
                  double dataStored = Double.parseDouble(lineScanner.next());
                  double dataLimit = Double.parseDouble(lineScanner.next());
                  cloudObj = new SharedCloud(name,
                     baseStorageCost, dataStored, dataLimit);
                  addCloudStorage(cloudObj);
                  break;
            
               case 'C':
                  dataStored = Double.parseDouble(lineScanner.next());
                  dataLimit = Double.parseDouble(lineScanner.next());
                  cloudObj = new PublicCloud(name,
                     baseStorageCost, dataStored, dataLimit);
                  addCloudStorage(cloudObj);
                  break;
            
               case 'P':
                  dataStored = Double.parseDouble(lineScanner.next());
                  dataLimit = Double.parseDouble(lineScanner.next());
                  cloudObj = new PersonalCloud(name,
                     baseStorageCost, dataStored, dataLimit);
                  addCloudStorage(cloudObj);
                  break;
            
               default:
                  throw new InvalidCategoryException(String.valueOf(type));
            }
         }
         
         catch (NumberFormatException e) {
            line = line + "\n" + e;
            addInvalidRecord(line);
         }
         
         catch (InvalidCategoryException e) {
            line = line + "\n" + e;
            addInvalidRecord(line);
         }
         
         catch (NoSuchElementException e) {
            line = line + "\n" + e + ": For missing input data";
            addInvalidRecord(line);
         }
      }
   }
    /**
     * Generates report.
     * @return output
     */  
   public String generateReport() {
      String output = "----------------------\n"
            + "Monthly Cloud Storage Report\n"
            + "----------------------\n";
      for (int i = 0; i < csList.length; i++) {
         output += csList[i].toString() + "\n" + "\n";
      }
      return output;
   }
    /**
     * Generates reports by name.
     * @return output
     */  
   public String generateReportByName() {
      Arrays.sort(getCloudStorageArray());
      String output = "----------------------\n"
         + "Monthly Cloud Storage Report (by Name)\n"
         + "----------------------\n";
      for (int i = 0; i < csList.length; i++) {
         output += csList[i].toString() + "\n" + "\n";
      }
      return output;
   }
    /**
     * Generates reports by monthly cost.
     * @return output
     */  
   public String generateReportByMonthlyCost() {
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
      String output = "----------------------\n"
            + "Monthly Cloud Storage Report (by Monthly Cost)\n"
            + "----------------------\n";
      for (int i = 0; i < csList.length; i++) {
         output += csList[i].toString() + "\n" + "\n";
      }
         
      return output;
   }
   /** Method for generating invalid records report.
    * @return output
    */
   public String generateInvalidRecordsReport() {
      String output = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------\n";
      for (int i = 0; i < invalidRecords.length; i++) {
         output += invalidRecords[i] + "\n" + "\n";
      }
      
      return output;
   }
}