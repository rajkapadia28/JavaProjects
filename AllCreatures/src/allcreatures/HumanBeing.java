
package allcreatures;

    /**
 * <h1> HumanBeing Class </h1>
 * This class is the parent class of males and females and consists of methods 
 * to retain information of human beings. 
 * Child class of Creatures.
 * @author Raj
 */
public class HumanBeing extends Creatures implements Comparable <HumanBeing> {
    
    
  private String name;
   private int age;
   
     /**
 * <h1> toString Method </h1>
 * Method used to output the information of human being in proper format. 
 * Overwritten from Creatures abstract class.
 * 
 * @author Raj
 */
  @Override
   public String toString(){
        String output = getClass().getName();
        output = output + '\n' + "Name is: " + getName() + '\n' + "Age is: "
                + getAge();
               
       return output;
       
   }
     /**
 * <h1> HumanBeing Constructor </h1>
 *Constructor with no parameters to create a human being object
 * @author Raj
 */
   public HumanBeing(){};
     /**
 * <h1> HumanBeing Constructor </h1>
 *Constructor to create a human being object.
 * Overwritten from creatures class.
 * @author Raj
 */
   public HumanBeing(String name, int age){
       
       this.name = name;
       this.age = age;
       this.intelligenceLevel= intelligenceLevel;
   }
   
     /**
 * <h1> Name Method </h1>
 * Method to get name of each human being. 
 * @author Raj
 */
   public String getName(){
       return name;
       
   }
     /**
 * <h1> Age Method </h1>
 * Method to get age of each human being.
 * @author Raj
 */
   public int getAge(){
       return age;
   }
 
     /**
 * <h1> Intelligence Method </h1>
 *Method used to get intelligence of each human being. 
 * @author Raj
 */
  public int getIntLevel(){
      return intelligenceLevel;
      
  }
     /**
 * <h1> Comparable Method </h1>
 * Creatures class implements comparable interface to override the compareTo 
 * method. This method is used to compare name of each human being and sorting it
 * in alphabetical order when called using "Collections.sort".
 * @author Raj
 */ 
   public int compareTo(HumanBeing other){
       
       return name.compareTo(other.name);
       
       
   }
        
  

   
   
}
