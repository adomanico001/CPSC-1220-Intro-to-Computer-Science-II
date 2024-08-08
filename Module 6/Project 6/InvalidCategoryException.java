/**
 * Instantiates class InvalidCategoryException.
 */
public class InvalidCategoryException extends Exception {
   private String message = null;
   
   /**
    * Constructor.
    * @param categoryIn - String
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + "\"" + categoryIn + "\"");
      this.message = "For category: " + "\"" + categoryIn + "\"";
   }
   
   /**
    * String description.
    * @return message
    */
   public String toString() {
      return message;
   }
   
   /**
    * Method to get message.
    * @return message
    */
   public String getMessage() {
      return message;
   }
}