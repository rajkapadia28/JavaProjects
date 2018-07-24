
package allcreatures;
import java.util.Comparator;
  /**
 * <h1> Male Class </h1>
 * This class is the child class of Creatures and consists of methods 
 * to retain information for males.
 * @author Raj
 */
public class Male extends HumanBeing  {

    private double height;
    private double weight;

 /**
 * <h1> Male Constructor </h1>
 *Constructor with no parameters to create a female object
 * @author Raj
 */
   public Male(){};
     /**
 * <h1> Male constructor</h1>
 * Constructor used for creating an object of males with the parameters.
 * @author Raj
 */
    public Male(String name, int age, double height,
            double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;

        if ((weight >= 400) && (height >= 100)) {
            throw new notHumanBeingException("This male is an invalid human");
        }
    }

         /**
 * <h1> toString Method </h1>
 * Method used to output the information of males in proper format.
 * Overrides method from creatures class.
 * @author Raj
 */
    public String toString() {
        String output = super.toString();
        output = '\n' + output + '\n' + "Height is:  " + getHeight()
                + '\n' + "Weight is: " + getWeight() + '\n' + "Intelligence Level is: "
                + getIntLevel() + '\n';

        return output;

    }

         /**
 * <h1> Height Method </h1>
 * Created method to return height.
 * @author Raj
 */
    public double getHeight() {

        return height;
    }
       /**
 * <h1> Weight Method </h1>
 * Created method to return weight.
 * @author Raj
 */
    public double getWeight() {
        return weight;
    }
       /**
 * <h1> Intelligence Method </h1>
 * Created method to return intelligence. Overrides method from Creatures class.
 * @author Raj
 */
    public int getIntLevel() {
        int maleAge = getAge();
        double maleWeight = getWeight();
        double maleHeight = getHeight();

        if (maleAge < 5) {// If statements to determine intelligence level.
            intelligenceLevel = 1;
        }
        if (maleAge > 40) {
            intelligenceLevel = 5;
        }
        if ((maleWeight >= 150) && (maleHeight > 70)) {
            intelligenceLevel = 5;
        } else if ((maleWeight >= 120 && maleWeight <= 149) && (maleHeight > 70)) {
            intelligenceLevel = 4;
        } else if ((maleWeight >= 50 && maleWeight <= 119)) {
            intelligenceLevel = 3;
        } else if ((maleWeight >= 120 && maleWeight <= 149) && (maleHeight >= 55
                && maleHeight <= 69)) {
            intelligenceLevel = 2;

        } else {
            intelligenceLevel = 3;
        }

        return intelligenceLevel;

    }
  
}
