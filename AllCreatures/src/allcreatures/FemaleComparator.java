
package allcreatures;

import java.util.Comparator;

  /**
 * <h1> Comparator Class for Females </h1>
 * Class used to compare the age of females.
 * @author Raj
 */
public class FemaleComparator implements Comparator <Female> {
    
    public int compare(Female f1, Female f2){
        
        if(f1.getAge() - f2.getAge() > 0){
            return 1;
        }else return -1;
       
        
        
    }
    
    
    
}
