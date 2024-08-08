import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Initiates the class representing the Cloud Storage, Part 1 Test.
 */
public class CloudStoragePart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getCountTest() {
      CloudStoragePart1.main(null);
      Assert.assertEquals("get count failed", 5, 
         CloudStorage.getCount(), .0001);
      CloudStorage.resetCount();
      Assert.assertEquals("get count failed", 0, 
         CloudStorage.getCount(), .0001);
   }
   
}
