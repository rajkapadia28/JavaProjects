/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarr;

/**
 *
 * @author Raj
 */
public class Stackarr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Stackmethod s1 = new Stackmethod();
        
       s1.push(1);
        s1.push(2);
         s1.push(14); s1.push(15);
          s1.push(9); s1.push(11); s1.push(17); s1.push(12);s1.push(32);
          s1.push(99);
          s1.push(142);
          s1.pop();
          s1.pop();
          s1.pop();
          s1.pop();
          
          
         System.out.println(s1.isEmpty());
         System.out.println(s1.peek());
         System.out.println(s1.toString());
    }
    
}
