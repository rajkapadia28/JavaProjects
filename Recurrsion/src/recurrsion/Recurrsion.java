/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurrsion;

/**
 *
 * @author Raj
 */
public class Recurrsion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Factorial f1 = new Factorial();
        f1.factor(3);
        System.out.println(f1.factor(5));
        System.out.println(f1.getSum(1234));
    }
    
}
