
package myarray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *MyArray class that creates two arrays of type Array and uses methods to add 
 * elements, compare arrays, sum the elements, invert and sort the array. 
 * @author Raj Kapadia 
 */
public class MyArray {

     /**
     * Main method that creates an array by reading the file.
     * <br> 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);
        int n = in.nextInt();// Reads first line to get number of elements in the 
        //array.
        Array MA1 = new Array(10);//Initialize array of type Array
        outFile.println("The size of array MA1 is: " + n);//Adds elements to 
        //array while reading the file. 
        for (int x = 0; x < n; x++) {
            MA1.addNumber(in.nextInt());
        }

        outFile.println(MA1.toString());//Prints Array using the methods
        outFile.println("The Largest Number is " + MA1.maxNumber());
        outFile.println("The Smallest Number is " + MA1.minNumber());
        outFile.println("The sum of all the elements are: " + MA1.sumArray());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();//Deep copy of 
        //array MA1 to MA2 in order to have no similar reference point in memory 
        //location
        oos = new ObjectOutputStream(bos);
        // serialize and pass the object
        oos.writeObject(MA1);
        oos.flush();
        ByteArrayInputStream bin
                = new ByteArrayInputStream(bos.toByteArray());
        ois = new ObjectInputStream(bin);
        // return the new object
        Array MA2 = (Array) ois.readObject();

        outFile.println("MA1 and MA2 are equal: " + MA1.equals(MA2));
        MA2.sort();// Equals method used. 
        outFile.println("MA1 and MA2 are equal after sorting MA2: "
                + MA1.equals(MA2));
        outFile.println("The sorted array MA2 is: " + MA2);
        while (in.hasNext()) {/// While loop used to read the remaining lines
            //and searching for the position of each element. 
            int line = in.nextInt();
            outFile.println("The element " + line + " is in position "
                    + MA2.search(line));
        }

        MA2.invertArrays();// Inverts array and prints inverted array.
        outFile.println("The inverted array for MA2 is: " + MA2);
        outFile.close();
    }
}
