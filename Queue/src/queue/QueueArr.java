/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Arrays;

/**
 *
 * @author Raj
 */
public class QueueArr implements QueueInterface {
    
    public static int size = 10;
    private int arr [];
    private int first;
    private int rear;
    private int arrSize;
    
    
    
    public QueueArr(){
        arr = new int [size];
        first = 0;
        rear = -1;
        size =0;
    }
    
    
    public void makeEmpty(){
        rear = -1;
        size = 0;
    }
    public boolean isEmpty(){
        return (size == 0);
        
    }
    public boolean isFull(){
        
     return (size == arr.length);
    }
    public void enqueue(int x){
      if(isFull()){
          doubleArray();
      }else 
          rear = (rear+1) % arr.length;
          arr[rear] = x;
          size++;
        
    }
    
       public void doubleArray(){
        int [] arr2 = new int[arr.length*2];
        for(int i= 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
           arr = arr2;     
        
    }
    public int deque(){
        if(isEmpty()){
            throw new QueException("Not Possible");
        }else{
            int x = arr[first];
            first = (first+1) % arr.length;
            size--;
        return x;
        }
       
    }
    
        public String toString(){
        
            
        String output = Arrays.toString(arr);
        return output;
    }
            
    
    
}
