/**
 * A program that represents a Spherocylinder object.
 * Module 3 - Project 3, part 3
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/26/2023
 */
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test program for SpherocylinderTest class.
 */
public class SpherocylinderTest {
/**
 * Initiatizes double DELTA.
 */
   public static final double DELTA = .001;
   /**
    * Fixture initialization.
    */
   @Before public void setUp() {
   }
   /**
    * Test for getLabel method.
    */
   @Test public void getLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Small Example", example1.getLabel());
   }
   /**
    * Test for setLabel method.
    */
   @Test public void setLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setLabel("Test");
      Assert.assertEquals("Test", example1.getLabel());
   }
   /**
    * Test 2 for setLabel method.
    */
   @Test public void setLabelTest2() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setLabel("Test");
      Assert.assertEquals(false, example1.setLabel(null));
   }
   /**
    * Test for getRadius method.
    */
   @Test public void getRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0.5, example1.getRadius(), DELTA);
   }
   /**
    * Test for setRadius method.
    */
   @Test public void setRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setRadius(0.2);
      Assert.assertEquals(0.2, example1.getRadius(), DELTA);
   }
   /**
    * Test 2 for setRadius method.
    */
   @Test public void setRadiusTest2() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setRadius(0.2);
      Assert.assertEquals(false, example1.setRadius(-0.1));
   }
   /**
    * Test for getCylinderHeight method.
    */
   @Test public void getCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.getCylinderHeight();
      Assert.assertEquals(0.25, example1.getCylinderHeight(), DELTA);
   }
   /**
    * Test for setCylinderHeight method.
    */
   @Test public void setCylinderHeightTestEquals() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setCylinderHeight(0.1);
      Assert.assertEquals(0.1, example1.getCylinderHeight(), DELTA);
   }
   /**
    * Test for setCylinderHeight method.
    */
   @Test public void setCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.setCylinderHeight(0.1);
      Assert.assertEquals(false, example1.setCylinderHeight(-0.1));
   }
   /**
    * Test for circumference method.
    */
   @Test public void circumferenceTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.142, example1.circumference(), DELTA);
   }
   /**
    * Test for surfaceArea method.
    */
   @Test public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.927, example1.surfaceArea(), DELTA);
   }
   /**
    * Test for volume method.
    */
   @Test public void volumeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0.72, example1.volume(), DELTA);
   }
   /**
    * Test for count method.
    */
   @Test public void countTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(28, example1.getCount());
   }
   /**
    * Test for equals method.
    */
   @Test public void equalsTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder(" Medium Example ", 
         10.8, 10.1);
      Assert.assertEquals(false, example1.equals(example2));
   }
   /**
    * Test 2 for equals method.
    */
   @Test public void equalsTest2() {
      Spherocylinder example1 = new Spherocylinder("Small Example",
         0.5, 0.25);
      Spherocylinder example3 = new Spherocylinder("Large Example",
         98.32, 99.0);
      Assert.assertEquals(false, example1.equals(example3));
   }
   /**
    * Test 3 for equals method.
    */
   @Test public void equalsTest3() {
      String test = "";
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(false, example1.equals(test));
   }
   /** 
    * Test 4 for equals method.
    */
   @Test public void equalsTest4() {
      String test = "";
      Spherocylinder example1 
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Assert.assertEquals(false, example1.equals(example2));
   }
   /**
    * Test 5 for equals method.
    */
   @Test public void equalsTest5() {
      String test = "";
      Spherocylinder example1 
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Assert.assertEquals(false, example1.equals(example2));
   }
   /**
    * Test for toString method.
    */
   @Test public void toStringTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String toString = example1.toString();
      Assert.assertTrue(toString.contains("Small Example"));
   }
   /**
    * Test for hashCode method.
    */
   @Test public void hashCodeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0, example1.hashCode());
   }
   /**
    * Test for compareTo method.
    */
   @Test public void compareToTest1() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue(example1.compareTo(example2) == 0);
   }
   /**
    * Test 2 for compareTo method.
    */
   @Test public void compareToTest2() {
      Spherocylinder example1 
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 
         = new Spherocylinder(" Medium Example ", 10.8, 10.1);
      Assert.assertTrue(example1.compareTo(example2) < 0);
   }
   /**
    * Test 3 for compareTo method.
    */
   @Test public void compareToTest3() {
      Spherocylinder example1 
         = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example3 
         = new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertTrue(example3.compareTo(example1) > 0);
   }
   /**
    * Test for resetCount method.
    */
   @Test public void resetCountTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.resetCount();
      Assert.assertEquals(0, example1.getCount());
   }
}