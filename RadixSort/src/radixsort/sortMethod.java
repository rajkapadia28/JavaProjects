 /*********************************************************************
 Purpose/Description: Radix Sort Assignment 4
 Author’s Panther ID: 5704911
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 ********************************************************************/ 
package radixsort;




/**
 * <h1>Complexity of Radix Algorithm </h1>
 * 
 * The complexity for this program is O(n + n^2) as n is the complexity to find
 * the max number and n^2 is the complexity of the while loop with nested for
 * loops.
*/
import java.util.ArrayList;

/**
 *
 * @author Raj
 */
public class sortMethod {

    int max = 0;

    
    
    //constructor for this class
    public sortMethod() { 

    }

    
    // Method used to find the maximum value in a given array
    public int getMax(int arr[]) {

        for (int i = 0; i < arr.length; i++) {//for loop that iterates through the array 

            if (arr[i] > max) {//compares between values in the array
                max = arr[i];

            }
        }
        return max; //returns max value
    }
    
    
    // Method used to find the number of digits within the max number to have Radix
    public int getRadixCount(int arr[]){ 
        
        int count =0;
        int maxNum = getMax(arr);
        
        while(maxNum > 0){//loop to make sure max number is greater than 0
            count += 1;
             maxNum = (maxNum/10);//divides max number and keeps count of how 
             //how many times it is divided to set radix count
        }
        return count;
        
    }   
    

    // method used to sort the array. 
    public void radixSort(int arr[]){
        
        int m = getMax(arr);//m stores max number
        int c = getRadixCount(arr);//stores 
        int exp = 1;
        int i;
//        ArrayList <Integer> b = new ArrayList<Integer>();
        int b [] = new int [10];
        
        
        while(m /exp > 0){
              int[] bucket = new int[10];
 
            for (i = 0; i < arr.length; i++){
   
                bucket[(arr[i] / exp) % 10]++;
                
                if(((arr[i] / exp) % 10)%2 !=0){
                System.out.println("There is an odd Number found at index " + i);
            }          
            }
            for (i = 1; i < 10; i++){
                bucket[i] += bucket[i - 1];
            }
            for (i = arr.length - 1; i >= 0; i--){
                b[--bucket[(arr[i] / exp) % 10]] = arr[i];
            }
            for (i = 0; i < arr.length; i++){
                arr[i] = b[i];
            }
            exp *= 10;        
        }
        
            
            
        }
        
        
        
    }
  
        


