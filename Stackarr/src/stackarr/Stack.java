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
public interface Stack {
    
    public abstract boolean isEmpty();
    public abstract void makeEmpty();
    public abstract void push(int x);
    public abstract int peek();
    public abstract int pop();
    
}
