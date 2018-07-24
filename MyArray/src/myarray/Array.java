
package myarray;

import java.io.Serializable;
import java.util.Arrays;

  /**
 * <h1> Array Class </h1>
 * This class focuses on the methods used to compare arrays, add elements,
 * invert and sort arrays, and find the maximum and minimum in an array.
 * @author Raj
 */
public class Array implements Serializable {

    private int n;
    private int[] arr;
    private Array arr1;
    private int sum = 0;
    private int length;
    private int elements;

    /**
 * <h1> Array Constructor </h1>
 *Constructor with number of elements as a parameter to build an array of size
 * elements.
 * @author Raj
 */
    public Array(int elements) {

        this.elements = elements;
        int arr[] = new int[elements];
        this.arr = arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    
    
           /**
 * <h1> sumArray Method </h1>
 * Method used to output the sum of the elements in an array using recursion. 
 * @author Raj
 */
    public int sumArray() {

        return sumArray(arr, 0);
    }

              /**
 * <h1> sumArray Method </h1>
 * Different method as it has a different signature than sumArray.
 * This method is a helper method in which recursion exists. 
 * @author Raj
 */
    private int sumArray(int[] arr, int st) {

        if (st == arr.length - 1) {
            return arr[st];
        }
        return arr[st] + sumArray(arr, st + 1);
    }

                  /**
 * <h1> getSize Method </h1>
 * Finds the size of an array. 
 * @author Raj
 */
    public int getSize() {

        int size = 0;
        for (int x = 0; x < arr.length; x++) {// Ignores additional zeros in
            //array to avoid getting zero as a minimum value.
            if (arr[x] != 0) {
                size++;
            }
        }
        return size;
    }

                  /**
 * <h1> addNumber Method </h1>
 * Adds the elements in an array using recursion. Creates a new array of size 
 * twice the original if the length is too small for the elements.
 * @author Raj
 */
    public void addNumber(int value) {
        int lastInd = arr.length - 1;
        int count = 0;
        for (int y = 0; y <= lastInd; y++) {// used to check the 
            if (arr[y] == 0) {
                arr[y] = value;
                count++;
                break;
            }
            if (arr[y] != 0) {
                count++;
            }
        }
        if (count >= arr.length) {
            checkArrayLength();
        }
    }

                      /**
 * <h1> checkArray Method </h1>
 * Checks the length of the array and compares it to number of elements. If the 
 * size of the array is too small, the array will be doubled in size and 
 * will copy the old array into the new one.
 * @author Raj
 */
    public void checkArrayLength() {
        if (getSize() == arr.length) {//If statement checking the length
            int newSize = arr.length * 2;
            int[] newArray = new int[newSize];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;

        }
    }

                      /**
 * <h1> invertArrays Method </h1>
 * Inverts arrays using recursion.
 * @author Raj
 */
    public int invertArrays() {
        return invertArrays(arr, 0, arr.length - 1);
    }
                  /**
 * <h1> invertArrays Method </h1>
 * Inverts array by comparing the start and end index and switching the position 
 * of each. The start index increases and the last index decreases. Once both 
 * are equal, recursion ends. 
 * @author Raj
 */
    private int invertArrays(int[] arr, int st, int last) {
        int temp = arr[st];
        if (st < last) {
            arr[st] = arr[last];
            arr[last] = temp;
            return invertArrays(arr, st + 1, last - 1);
        }
        return temp;
    }

    
                         /**
 * <h1> maxNumber Method </h1>
 * Finds maximum number using recursion.
 * @author Raj
 */
    public int maxNumber() {

        return arr[maxNumber(arr, 0)];
    }
                         /**
 * <h1> maxNumber Method </h1>
 * Finds maximum number by comparing the index and maximum number. 
 * @author Raj
 */
    private int maxNumber(int[] arr, int index) {

        if (index == this.getSize() - 1) {
            return index;
        }
        int max = maxNumber(arr, index + 1);
        int cmp = Integer.compare(arr[index], (arr[max]));
        if (cmp > 0) {
            return index;
        } else {
            return max;
        }
    }
                         /**
 * <h1> minNumber Method </h1>
 * Finds minimum number using recursion.
 * @author Raj
 */
    public int minNumber() {

        return arr[minNumber(arr, 0)];
    }
                       /**
 * <h1> minNumber Method </h1>
 * Finds minimum number by comparing the index and minimum number. 
 * @author Raj
 */
    private int minNumber(int[] arr, int index) {

        if (index == this.getSize() - 1) {
            return index;
        }
        int min = minNumber(arr, index + 1);
        int cmp = Integer.compare(arr[index], arr[min]);
        if (cmp < 0) {
            return index;
        } else {
            return min;
        }
    }
                      /**
 * <h1> sort Method </h1>
 * Sorts array using bubble sort algorithm with recursion. 
 * @author Raj
 */
    public int[] sort() {
        return sort(arr, arr.length);
    }
                      /**
 * <h1> sort Method </h1>
 * Sorts array by looking if an element in the array is larger than the 
 * element in the index above. If it is larger, the position will switch. 
 * 
 * @author Raj
 */
    private int[] sort(int[] arr, int n) {
        if (n == 1) {
            return arr; //finished sorting
        }

        int temp;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return sort(arr, n - 1);
    }
    
                          /**
 * <h1> getIndex Method </h1>
 * Retrieves index of an array and throwing an exception if the index does 
 * not exist.
 * @author Raj
 */

    public int getIndex(int index) {

        if (index > arr.length) {
            throw new NoSuchElementException("Element does not exist");

        } else {
            return arr[index];
        }
    }
                      /**
 * <h1> search Method </h1>
 * Searches for an element using binary search algorithm with recursion. 
 * @author Raj
 */
    public int search(int target) {
        return search(arr, 0, arr.length - 1, target);
    }
                      /**
 * <h1> search Method </h1>
 * Searches for an element by looking at middle index and comparing the intended
 * target with middle value to see where it lies in the array. If the target is 
 * above the middle index it will start at a new position of above the middle 
 * and recall this method. If the target is below the middle value, then it will
 * start at a new position below the index and recall this method until the middle
 * index equals to the target. 
 * @author Raj
 */
    private int search(int[] arr, int start, int end, int target) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }

        if (target == arr[middle]) {
            return middle;
        } else if (target < arr[middle]) {
            return search(arr, start, middle - 1, target);
        } else if (target > arr[middle]) {
            return search(arr, middle + 1, end, target);
        }
        
        return search(arr, middle, end, target);
    }

                          /**
 * <h1> equals Method </h1>
 * Compares two arrays and looking at whether it is equal if the lenght is the 
 * same and has the same elements. 
 * @author Raj
 */
    public boolean equals(Object other) {
        Array myArray = (Array) other;
        if (this.getSize() != myArray.length) {
            return false;
        }
        return equals(this, myArray, 0);
    }
                          /**
 * <h1> equals Method </h1>
 * Compares two arrays using recursion.
 * @author Raj
 */
    private boolean equals(Array arr1, Array arr2, int st) {

        if (st == arr1.length) {
            return true;
        } else if (arr2.getIndex(st) != arr1.getIndex(st)) {
            return false;
        }
        return equals(arr1, arr2, st + 1);
    }
       /**
 * <h1> toString Method </h1>
 * Method used to output the information of Arrays in proper format.
 * @author Raj
 */
    @Override
    public String toString() {

        String output = getClass().getName();
        output = output + '\n' + "The size of the array is: " + this.getSize()
                + '\n' + "The Array contains: " + Arrays.toString(arr);
        return output;
    }
}
