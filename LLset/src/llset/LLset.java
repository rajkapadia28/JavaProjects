
package llset;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

  /**
 * <h1> LLset Class </h1>
 * 
 * This class reads the input to create sets and linked lists accordingly.
 * @author Raj
 */
public class LLset {

     /**
     * Main method that creates an array by reading the file.
     * <br> 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);
        LL[] arr = new LL[in.nextInt()];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = new LL();
        }

        while (in.hasNext()) {

            String line = in.next();

            switch (line) {

                case "A"://Case for adding elements to a set.
                    int x = in.nextInt();
                    int y = in.nextInt();

                    arr[y].add(x);
                    break;

                case "O":// output of the set
                    int setNum = in.nextInt();
                    outFile.println("The elements in set " + setNum + " are" 
                            +arr[setNum] + "}");
                    break;
                    
                case "E":// case to check if a set is empty.
                    int l =in.nextInt();

                    outFile.println("Set "+ l + " is empty: "+ arr[l].isEmpty());

                    break;

                case "B":// case to see if an element belongs to a set.
                    int x3 = in.nextInt();
                    int x4 = in.nextInt();

                    outFile.println("The Set contains " + x3 + " in set " + x4 
                            + ": "+  arr[x4].isMember(x3));
                    break;

                case "R":// case to remove an item
                    int x5 = in.nextInt();
                    int x6 = in.nextInt();

                    arr[x6].remove(x5);
                    break;

                case "U":// case to make a set of a union between two sets.

                    arr[in.nextInt()].union(arr[in.nextInt()], 
                            arr[in.nextInt()]);

                    break;
                    
                case "N":// case to make a set of a intersection between two sets.
                   
                     arr[in.nextInt()].intersection(arr[in.nextInt()], 
                            arr[in.nextInt()]);
                    break;

                case "D":// case to make a set of a difference between two sets.

                    arr[in.nextInt()].difference(arr[in.nextInt()], 
                            arr[in.nextInt()]);
                    break;

                case "Q":// case to see if a set is equal.
                    int set = in.nextInt();
                    int nextSet = in.nextInt();
                    outFile.println("Sets " + set + " and "+ nextSet
                            +" are equal: "
                            + arr[set].equals(arr[nextSet]));
                    break;
                default:
                    break;

            }

        }
        outFile.close();

    }

}
