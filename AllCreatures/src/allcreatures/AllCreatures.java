
package allcreatures;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Tester Class that creates an array and array list of Humans by reading an 
 * input file. 
 * @author Raj
 */
public class AllCreatures {

    /**
     * Main method that creates an array list of Humans and arrays for both 
     * male and female. 
     * <br> 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int numberOfMales = 0;
        int numberOfFemales = 0;

        ArrayList<HumanBeing> allHumans = new ArrayList<>();// Creats arraylist 
        //of type HumanBeing
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);
        Male males[] = new Male[16];//Array of type male
        Female females[] = new Female[12];//Array of type female 
        int i = 0;
        int j = 0;

        while (in.hasNext()) {// While loop used to read input file and store
            //values into the array and array list. 

            String line = in.next();

            switch (line) {
                case "M":// Looks for Males

                    try {//Statement that adds items to the array and arraylist
                        int numberM = 0;
                        Male m = new Male(in.next(), in.nextInt(),
                                in.nextDouble(),
                                in.nextDouble());
                        allHumans.add(m);

                        males[i] = m;
                        i++;

                    } catch (notHumanBeingException e) {// Catches an exception
                        //if humanbeing is not considered human
                        String message = e.getMessage();
                        outFile.println(message);
                    }
                    break;
                case "F":// looks for Females
                    try {
                        Female f = new Female(in.next(), in.nextInt(),//Stores values from input file. 
                                in.next());
                        allHumans.add(f);// Adds object into arrayList
                        females[j] = f;// Adds object into array
                        j++;

                    } catch (notHumanBeingException e) {
                        String message = e.getMessage();
                    }
                    break;
                default:
                    break;
            }
        }//End of while loop
        
        outFile.println("Unsorted Array List of Humans: "+allHumans.toString());
        Collections.sort(allHumans);//Sorts Array List according to name
        outFile.println("Sorted Array List of Humans: "+ allHumans.toString());
        outFile.println("Unsorted Array of Males: " + Arrays.toString(males));
        Arrays.sort(males, new MaleComparator());//Sorts array of males according to 
        //height
        outFile.println("Array of Males sorted according to Height: "
                + Arrays.toString(males));
        outFile.println("Unsorted Array of Females: "+Arrays.toString(females));
        Arrays.sort(females, new FemaleComparator());//Sorts array of females according to 
        //age.
        outFile.println("Array of Females sorted according to the age: "
                + Arrays.toString(females));
        outFile.close();
    }
}
