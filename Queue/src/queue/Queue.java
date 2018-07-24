/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Raj
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    
    QueueArr q1 = new QueueArr();
        
    System.out.println(q1.isEmpty());
    q1.enqueue(31);
    q1.enqueue(21);
    q1.enqueue(19);
    q1.enqueue(11);
    q1.enqueue(5);
    q1.enqueue(31);
    q1.enqueue(21);
    q1.enqueue(19);
    q1.enqueue(11);
    q1.enqueue(5);
    q1.deque();
    q1.deque();
    q1.enqueue(12);
    
    System.out.println(q1.toString());
    
    
    
    }
    
}
