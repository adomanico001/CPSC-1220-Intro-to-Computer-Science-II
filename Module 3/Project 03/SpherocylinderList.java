/**
 * A program that represents a Spherocylinder object.
 * Module 3 - Project 3, part 3
 * @author Addie Domanico - CPSC 1220 - AO2
 * @version 03/36/2023
 */

import java.util.Arrays;
/**
 * Test program for SpherocylinderList class.
 */
public class SpherocylinderList {
   private String name;
   private int numberOfSpherocylinders;
   private Spherocylinder[] spherocylinders;
   private static final int MAX = 100;
   
   /**
    * Constructor.
    * @param nameIn - String nameIn
    */
   public SpherocylinderList(String name, Spherocylinder[] spherocylinders, int numberOfSpherocylinders) {
      this.name = name;
      this.spherocylinders = Arrays.copyOf(spherocylinders, numberOfSpherocylinders);
      this.numberOfSpherocylinders = numberOfSpherocylinders;
   }
   
   /**
    * Accessor - getName accesses name of object created.
    * @return - name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Accessor - getNumberofSpherocylinders accesses the number
    * of spherocylinder objects.
    * @return - numberOfSpherocylinders
    */
   public int getNumberOfSpherocylinders() {
      return numberOfSpherocylinders;
   }
   
   /**
    * Method to return the total surface area.
    * @return - total
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      for (Spherocylinder s : spherocylinders) {
         totalSurfaceArea += s.getSurfaceArea();
      }
      return totalSurfaceArea;
   }
   
   public double totalVolume() {
      double totalVolume = 0.0;
      for (Spherocylinder s : spherocylinders) {
         totalVolume += s.getVolume();
      }
      return totalVolume;
   }
   
   /**
    * Method to return the average surface area.
    * @return - totalSurfaceArea / numberOfspherocylinders
    */
   public double averageSurfaceArea() {
      if (numberOfSpherocylinders == 0) {
         return 0.0;
      }
      return totalSurfaceArea() / numberOfSpherocylinders;
   }
   
   /**
    * Method to return the average volume.
    * @return - averageVolume / numberOfSpherocylinders
    */
   public double averageVolume() {
      if (numberOfSpherocylinders == 0) {
         return 0.0;
      }
      return totalVolume() / numberOfSpherocylinders;
   }
   
   /**
    * Method for object description.
    * @return - output
    */
   public String toString() {
      String summary = "";
      String.format("Summary for %s\nNumber of Spherocylinders: %d\nTotal Surface Area: %.3f\nTotal Volume: %.3f\nAverage Surface Area: %.3f\nAverage Volume: %.3f",
         name, numberOfSpherocylinders, totalSurfaceArea(), totalVolume(), averageSurfaceArea(), averageVolume());
      return summary;
   }
   /**
    * Accessor - getList accesses the list of spherocylinders.
    * @return - cylinders
    */
   public Spherocylinder[] getList() {
      return spherocylinders;
   }
   
   /**
    * Method to add a spherocylinder to the list.
    * @param label - String label
    * @param radius - double radius
    * @param height - double height
    */
   public void addSpherocylinder(String label,
      double radius, double cylinderHeight) {
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         if (numberOfSpherocylinders == spherocylinders.length) {
            spherocylinders = Arrays.copyOf(spherocylinders, numberofSpherocylinders + 1);
         }
         spherocylinders[numberOfSpherocylinders] = s;
         numberOfSpherocylinders++;
      }
   }
   
   /**
    * Method to find a spherocylinder object.
    * @param label - String label
    * @return - returns result
    */
   public Spherocylinder findSpherocylinder(String label) {      for (Spherocylinder s : spherocylinders) {
         if (s.getLabel().equalsIgnoreCase(label)) {
            return s;
         }
      }
      return null;
   }
}