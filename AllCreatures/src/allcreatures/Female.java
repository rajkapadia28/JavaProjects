
package allcreatures;

  /**
 * <h1> Female Class </h1>
 * This class is the child class of Creatures and consists of methods 
 * to retain information for Females.
 * @author Raj
 */
public class Female extends HumanBeing {
    
    private String lastDegree;
    
     /**
 * <h1> Female Constructor </h1>
 *Constructor with no parameters to create a female object
 * @author Raj
 */
    public Female(){};
        /**
 * <h1> Female constructor</h1>
 * Constructor used for creating an object of females with the parameters.
 * @author Raj
 */
    public Female(String name, int age, String degree) {
        super(name, age);
        this.lastDegree = degree;
        
        if(age > 110){
            throw new notHumanBeingException("Sorry but this Female is an"
                    + "invalid Human");
        }
    }
    
            /**
 * <h1> toString Method </h1>
 * Method used to output the information of females in proper format.
 * Overrides method from creatures class.
 * @author Raj
 */
      public String toString(){
        String output = super.toString();
        output = '\n' + output + '\n' +"Degree is: " + getLastDegree()+ '\n' + 
                "Intelligence Level is: "
                + getIntLevel() + '\n';
       return output;
   }

               /**
 * <h1> LastDegree Method </h1>
 * Created method to return the degree.
 * @author Raj
 */
    public String getLastDegree(){
        return lastDegree;   
    }
    
        /**
 * <h1> Intelligence Method </h1>
 * Created method to return intelligence. Overrides method from Creatures class.
 * @author Raj
 */
    
    @Override
    public int getIntLevel(){
        
        String degree = getLastDegree();
        if(degree.equalsIgnoreCase("PH.D")){// If statements to determine the intelligence level of
            //females based on last degree.
            intelligenceLevel = 5;
        }else if(degree.equalsIgnoreCase("MS")){
            intelligenceLevel = 4;
        }else if (degree.equalsIgnoreCase("BS")){
            intelligenceLevel = 3;
        }else if(degree.equalsIgnoreCase("AA")){
            intelligenceLevel= 2;
        }else intelligenceLevel = 1;
        
        return intelligenceLevel;
    }
}
