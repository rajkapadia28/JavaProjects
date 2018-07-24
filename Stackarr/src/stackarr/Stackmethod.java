/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarr;

import java.util.Arrays;

/**
 *
 * @author Raj
 */
public class Stackmethod implements Stack {
    
    public static int defaultsize = 10;
    int [] arr;
    int tos;
    
    
    public void doubleArray(){
        int [] arr2 = new int[arr.length*2];
        for(int i= 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
           arr = arr2;     
        
    }
    
    public Stackmethod(){
        arr = new int [defaultsize];
        tos = -1;
        
    }
    
    public Stackmethod(int z){
        arr = new int[z];
        tos = -1;
    }
    
    @Override
    public boolean isEmpty(){
        return tos == -1;
        
    }
    
    @Override
    public void makeEmpty(){
        tos = -1;
        
    }
    
    @Override
    public void push(int x){
        
         if(tos == (arr.length -1)){
            doubleArray();
            arr[++tos] =x;
        }
        else {
            tos++;
            arr[tos] = x;
        }

    }
    @Override
    public int peek(){
        
        if(isEmpty()){
            throw new NoItemException("Not possible");
        }else{
                
        return arr[tos];
    }
    }
    public int pop(){
        int item;
        if(isEmpty()){
            throw new NoItemException("Not possible");
        }else{
            item = arr[tos];
            tos--;
            
        } 
        return item;      
    }
    
    public String toString(){
        
        String output = Arrays.toString(arr);
        return output;
    }

}
