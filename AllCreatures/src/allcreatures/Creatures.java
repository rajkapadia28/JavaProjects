
package allcreatures;

  /**
 * <h1> Creatures Class </h1>
 * This class is an abstract method and a parent class to Human Being. 
 * It is an abstract method as creatures are of many types, therefore most 
 * methods are overwritten by other classes. 
 * @author Raj
 */
public abstract class Creatures {
    
    
    
   int intelligenceLevel;
    
      /**
 * <h1> Intelligence Level Abstract Method </h1>
 * Method used to get intelligence level of a creature. Overwritten by other 
 * classes.
 * @author Raj
 */
   public abstract int getIntLevel();
   
   
     /**
 * <h1> toString Abstract Method </h1>
 * Method used to format the output.
 * @author Raj
 */
   public abstract  String toString();

}
