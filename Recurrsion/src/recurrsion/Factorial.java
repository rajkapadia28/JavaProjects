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
public class Factorial {
    
    
    public Factorial(){};
    public int factor(int x){
        
        int factorial;
        
        
        if(x ==0){
            return 1;
        }else{
            factorial = x * factor(x-1);
            return factorial;
        }
        
    }
    
    public int getSum(int x){
        int sum =0;
        if(x <=9 && x >=0){
            return x;
        }else
            
            sum = x % 10;
      
        return sum + getSum((x-sum)/10);
            
        
      
      
}
}      