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
public interface QueueInterface {
    
    public void makeEmpty();
    public boolean isEmpty();
    public void enqueue(int x);
    public int deque();
            
    
}
