/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallottogenerator2.pkg0;

// PantherID:  5704911
// CLASS: COP 2210 – Fall 2016
// ASSIGNMENT # 1
// DATE: 9/4/16
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
// PantherID:  5704911

import java.util.Random;
import javax.swing.JOptionPane;
public class FinalLottoGenerator20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Mom, I'd like to Welcome you to LottoGenerator 2.0");
        String Feel = JOptionPane.showInputDialog("Are you excited to use my program?");
        JOptionPane.showMessageDialog(null,"I hope you are! Now lets look at your first set of Fantasy 5 numbers.");
        
         Random r = new Random();  	
int x = 1 + r.nextInt(36);//Fantasy 5 Generator for 5 numbers
    int FantasyFirst = 1 +r.nextInt(36);// each variable is assigned to a random number
    int FantasySecond = 1 +r.nextInt(36);
    int FantasyThird = 1 + r.nextInt(36);  
    int FantasyFourth = 1 + r.nextInt(36);
    int FantasyFifth = 1 + r.nextInt(36);
    
     
        System.out.print( FantasyFirst + " " );
        System.out.print( FantasySecond + " " );
        System.out.print( FantasyThird  + " " );
        System.out.print( FantasyFourth + " " );
        System.out.println( FantasyFifth + " " );
        JOptionPane.showMessageDialog(null,"Your Fantasy Five Numbers are: " + FantasyFirst + " " + FantasySecond + " " + FantasyThird + " " + FantasyFourth + " " + FantasyFifth);
        JOptionPane.showMessageDialog(null,"Good Luck with your Fantasy 5 numbers!");
        JOptionPane.showMessageDialog(null,"Lets look at your Lotto Numbers next");
        
        int y = 1 + r.nextInt(53);//Lotto Numbers Generator 
 int LottoFirst = 1 + r.nextInt(53);
 int LottoSecond = 1 + r.nextInt(53);
 int LottoThird = 1 + r.nextInt(53);
 int LottoFourth = 1 + r.nextInt(53);
 int LottoFifth = 1 + r.nextInt(53);
 int LottoSixth = 1 + r.nextInt (53);
 
 System.out.println("Your Lotto Numbers are: ");
        System.out.print(LottoFirst + " ");
        System.out.print(LottoSecond + " ");
        System.out.print(LottoThird + " ");
        System.out.print(LottoFourth + " ");
        System.out.print(LottoFifth + " ");
        System.out.println(LottoSixth + " ");
        JOptionPane.showMessageDialog(null,"They are: " + LottoFirst + " " + LottoSecond + " " + LottoThird + " " + LottoFourth + " " + LottoFifth + " " + LottoSixth);
        JOptionPane.showMessageDialog(null,"I'm sure this was quicker way to select your numbers! You're welcome Mom!");
        
    }
    
}
