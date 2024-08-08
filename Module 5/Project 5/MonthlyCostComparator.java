import java.util.Comparator;

public class MonthlyCostComparator implements Comparator<CloudStorage> {
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