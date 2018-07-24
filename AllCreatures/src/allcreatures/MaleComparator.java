
package allcreatures;

import java.util.Comparator;

 /**
 * <h1> Comparator Class for Males </h1>
 * Class used to compare the height of Males.
 * @author Raj
 */
public class MaleComparator implements Comparator<Male>{
    
      public int compare (Male m1, Male m2){
        double compareHeight =  m1.getHeight() - m2.getHeight();
        return (int) compareHeight;
    }

    
}
