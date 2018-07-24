
package allcreatures;

  /**
 * <h1> Exception Class </h1>
 * This class is used to catch an exception if the Human is not considered 
 * a human being. 
 * @author Raj
 */
public class notHumanBeingException extends RuntimeException {//Exception Class
    
      public notHumanBeingException(){}
      
      /**
 * <h1> Constructor </h1>
 * Creates a notHumanBeingException using a message as a parameter.
 * @author Raj
 */
    public notHumanBeingException(String message){// Message parameted created
        super(message);
        
    }
   
}
