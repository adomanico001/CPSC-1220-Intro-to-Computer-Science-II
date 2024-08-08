import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Initializes the class PublicCloudTest.
 */
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
    /**
     * Method for getCostFactor test.
     */
   @Test public void getCostFactorTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      Assert.assertEquals("get cost factor failed", 2.0, 
         c4.getCostFactor(), .0001);
   }
    /**
     * Method for monthlyCost test.
     */
   @Test public void monthlyCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 
         25.0, 20.0);
      Assert.assertEquals("monthly cost failed", 19.00, 
         c4.monthlyCost(), .0001);
   }
    /**
     * Method for toString test.
     */
   @Test public void toStringTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      Assert.assertTrue(c4.toString().contains("Cloud Four"));
      Assert.assertTrue(c4.toString().contains("(class PublicCloud)"));
      Assert.assertTrue(c4.toString().contains("Monthly Cost: $19.00"));
      Assert.assertTrue(c4.toString().contains("Base Storage Cost: $9.00"));
      Assert.assertTrue(c4.toString().contains("Data Stored: 25.000 GB"));
      Assert.assertTrue(c4.toString().contains("Data Limit: 20.000 GB"));
      Assert.assertTrue(c4.toString().contains("Overage: 5.000 GB"));
      Assert.assertTrue(c4.toString().contains("Cost Factor: 2.0"));
   }
}