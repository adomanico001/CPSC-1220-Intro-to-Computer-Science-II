import org.junit.Assert;
import static org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Main class. */
public class CloudStoragePart1Test {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test method for getCount. **/
   @Test public void getCountTest() {
      CloudStoragePart1.main(null);
      
      Assert.assertEquals("get count failed",
         5, CloudStorage.getCount(), .0001);
      CloudStorage.resetCount();
      
      Assert.assertEquals("get count failed", 0,
         CloudStorage.getCount(), .0001);
   }
}
