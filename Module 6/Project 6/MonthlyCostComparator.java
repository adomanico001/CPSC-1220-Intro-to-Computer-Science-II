import java.util.Comparator;

/** Instantiates class MonthlyCostComparator. */
public class MonthlyCostComparator implements Comparator<CloudStorage> {
   /** Constructor.
    * @param c1 - CloudStorage
    * @param c2 - CloudStorage
    * @return - values
    */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return -1;
      }
      
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return 1;
      }
      
      else {
         return 0;
      }
   }
}