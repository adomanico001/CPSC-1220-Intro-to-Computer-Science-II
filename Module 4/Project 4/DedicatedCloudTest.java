import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Initiates the class representing the Dedicated Cloud Test.
 */
public class DedicatedCloudTest {
    /**
     * Fixture initialization.
     */
   @Before public void setUp() {
   }
    /**
     * Method to test the getAndSetName.
     */
   @Test public void getAndSetNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("get name failed", "Cloud One", c1.getName());
      c1.setName("Test");
      Assert.assertEquals("set name failed", "Test", c1.getName());
   }
    /**
     * Method to test the getAndSetBaseStorageCost.
     */
   @Test public void getAndSetBaseStorageCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("get base storage cost failed", 40.00, 
         c1.getBaseStorageCost(), .001);
      c1.setBaseStorageCost(98.00);
      Assert.assertEquals("set base storage cost failed", 98.00, 
         c1.getBaseStorageCost(), .001);
   }
   
    /**
     * Method to test the getAndSertServerCost.
     */
   @Test public void getAndSetServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("get server cost failed", 10.00, 
         c1.getServerCost(), .0001);
      c1.setServerCost(42.00);
      Assert.assertEquals("set server cost failed", 42.00, 
         c1.getServerCost(), .0001);
   }
    /**
     * Method to test the monthlyCost.
     */
   @Test public void monthlyCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("monthly cost failed", 50.00, 
         c1.monthlyCost(), .0001);
   }
    /**
     * Method to test the toString.
     */
   @Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      //Assert.assertTrue(c1.toString().contains("Cloud One"));
      Assert.assertTrue(c1.toString().contains("(class DedicatedCloud)"));
      Assert.assertTrue(c1.toString().contains("Monthly Cost: $50.00"));
      Assert.assertTrue(c1.toString().contains("Base Storage Cost: $40.00"));
      Assert.assertTrue(c1.toString().contains("Server Cost: $10.00"));
   }
   
}