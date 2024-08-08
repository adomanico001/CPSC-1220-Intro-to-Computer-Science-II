/** 
 * A program that represents a Spherocylinder object.
 * Module 3 - Project 3, part 3
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/26/2023
 */
 
import java.text.DecimalFormat;
 /**
  * Initiates the class representing a Spherocylinder object.
  */
public class Spherocylinder implements Comparable<Spherocylinder> {
   private String label = "";
   private double radius = 0.0;
   private double height = 0.0;
   //class variable:
   private static int count = 0;

   /**
    * Constructor.
    * @param labelIn - String label
    * @param radiusIn - double radius
    * @param heightIn - double height
    */
   public Spherocylinder(String labelIn, double radiusIn, 
      double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }
   
   /**
    * Accessor - getCount accesses total number of objects created.
    * @return - count
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Sets the count to zero.
    */
   public static void resetCount() {
      count = 0;
   }
  
   /** 
    * Accessor - getLabel accesses the instance variable label.
    * @return - String label
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Sets the instance variable label.
    * @param labelIn - String label
    * @return - boolean true/false 
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Accessor - getRadius accesses the instance variable radius.
    * @return - radius
    */
   public double getRadius() {
      return radius;
   }
   
   /**
    * Sets the instance variable radius.
    * @param radiusIn - double radius
    * @return - boolean true/false
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      
      else {
         return false;
      }
   }
   
   /**
    * Accessor getCylinderHeight accesses the instance variable height.
    * @return - double height
    */
   public double getCylinderHeight() {
      return height;
   }
   
   /**
    * Sets the instance variable height.
    * @param heightIn - double height
    * @return - boolean true/false
    */
   public boolean setCylinderHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Method to return the circumference.
    * @return - circumference
    */
   public double circumference() {
      return (2 * Math.PI * radius);
   }
   
   /**
    * Method to return the surface area.
    * @return - surface area
    */
   public double surfaceArea() {
      return (circumference() * (2 * radius + height));
   }
   
   /**
    * Method to return the volume.
    * @return - volume
    */
   public double volume() {
      double value1 = (Math.PI * Math.pow(radius, 2));
      double value2 = 4.0 / 3.0;
      return value1 * (((value2 * radius) + height));
   }
   
   /**
    * Method that verifies if two objects are equal.
    * @param obj - the object tested
    * @return - boolean true/false
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < 0.000001
            && Math.abs(height - d.getCylinderHeight()) < 0.000001);
      }
   }
   
   /**
    * Method for checkstyle.
    * @return - int
    */
   public int hashCode() {
      return 0;
   }
   /**
    * Method for comparing objects.
    * @param obj - object
    * @return - volume
    */
   public int compareTo(Spherocylinder obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      
      else {
         return 1;
      }
   }

    /**
    * Method for object description.
    * @return - output
    */
   public String toString() {
      DecimalFormat decFormat = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         + decFormat.format(radius) + " and cylinder height "
         + decFormat.format(height) + " has:";
      output += "\n\tcircumference = " + decFormat.format(circumference())
         + " units";
      output += "\n\tsurface area = " + decFormat.format(surfaceArea())
         + " square units";
      output += "\n\tvolume = " + decFormat.format(volume()) + " cubic units";
      return output;
   }
}