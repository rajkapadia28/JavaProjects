 /*********************************************************************
 Purpose/Description: Radix Sort Assignment 4
 Author’s Panther ID: 5704911
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 ********************************************************************/ 
package radixsort;

import java.util.Arrays;

/**
 *
 * @author Raj
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        sortMethod test = new sortMethod();
        int arr[] = {2,4,66,8,20,244,666};
        
        
        
        System.out.println("The maximum number in the array is: " 
                + test.getMax(arr));
        System.out.println("The radix number in the array is: " +
                test.getRadixCount(arr));
        test.radixSort(arr);
        System.out.println(Arrays.toString(arr));
        
        
        
        
        
        
        
    }
    
}
