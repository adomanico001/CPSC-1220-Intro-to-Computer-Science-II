import org.junit.Assert;
import static org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Instantiates PersonalCloudTest class. */
public class PersonalCloudTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test method for costFactor. **/
   @Test public void getCostFactorTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      Assert.assertEquals("get cost factor failed",
         3.0, c5.getCostFactor(), .0001);
   }
   /** Test method for monthlyCost. */
   @Test public void monthlyCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      Assert.assertEquals("monthly cost failed",
         12.00, c5.monthlyCost(), .0001);
   }
   /** Test method for toString. */
   @Test public void toStringTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      Assert.assertTrue(c5.toString().contains("Cloud Five"));
      Assert.assertTrue(c5.toString().contains("(class PersonalCloud)"));
      Assert.assertTrue(c5.toString().contains("Monthly Cost: $12.00"));
      Assert.assertTrue(c5.toString().contains("Base Storage Cost: $9.00"));
      Assert.assertTrue(c5.toString().contains("Data Stored: 21.000 GB"));
      Assert.assertTrue(c5.toString().contains("Data Limit: 20.000 GB"));
      Assert.assertTrue(c5.toString().contains("Overage: 1.000 GB"));
      Assert.assertTrue(c5.toString().contains("Cost Factor: 3.0"));
   }
}
