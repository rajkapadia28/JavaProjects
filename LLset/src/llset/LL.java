
package llset;

import static java.lang.Math.E;
import java.util.Collection;
import java.util.Iterator;

  /**
 * <h1> Linked List Class </h1>
 * This class consists of all methods to create a linked list using sets
 * @author Raj
 */
public class LL implements Set {

    private Set s;
    private Node first;

       /**
 * <h1> Node class</h1>
 *Created to implement nodes for the linked list
 * @author Raj
 */
    private class Node {

        private int data;
        private Node next;
   /**
 * <h1> Node Constructor </h1>
 *Constructor that creates a node.
 * @author Raj
 */
        public Node() {

            next = null;
        }
   /**
 * <h1> Node Constructor </h1>
 *Constructor that creates a node with data inside. 
 * @author Raj
 */
        public Node(int y) {
            data = y;
            next = null;
        }

    }
   /**
 * <h1> LL Constructor </h1>
 *Constructor that creates a node with first referencing to null.
 * @author Raj
 */
    public LL() {

        first = null;
    }

             /**
 * <h1> getSize Method </h1>
 * Method used to return size of linked list to use in other methods. 
 * @author Raj
 */
    public int getSize() {
        int size = 0;
        Node p = first;

        while (p != null) {

            p = p.next;
            size++;
        }
        return size;
    }

             /**
 * <h1> isEmpty Method </h1>
 * This method has been implemented from the Set interface to check whether the 
 * linked list is empty.
 * @author Raj
 */
 
    public boolean isEmpty() {
        
        return first ==null;
    }
            /**
 * <h1> makeEmpty Method </h1>
 * This method has been implemented from the Set interface to make a linked list 
 * empty.
 * @author Raj
 */
    @Override
    public void makeEmpty() {
        first = null;
    }
            /**
 * <h1> isMember Method </h1>
 * This method has been implemented from the Set interface to check if a
 * particular element is present within a linked list.
 * @author Raj
 */
    @Override   
    public boolean isMember(int x) {
        return isMember(x, first);
    }
            /**
 * <h1> isMember Helper Method </h1>
 *Helper method used for recursion. 
 * @author Raj
 */
    private boolean isMember(int x, Node p) {

        if (p == null) {
//            throw new NoSuchElementException("The element is not a member in "
//                    + "set the ");
            return false;
        }
        if (p.data == x) {
            return true;
        } else {
            return isMember(x, p.next);
        }
    }
            /**
 * <h1> Add Method </h1>
 * This method has been implemented from the Set interface to add elements to 
 * a set.
 * @author Raj
 */
    @Override
    public void add(int x) {

        if (isEmpty()) {
            Node p = new Node();
            p.data = x;
            p.next = null;
            first = p;
        } else if (isMember(x)) {
            return;
        } else {
            add(x, first);
        }

    }      
    /**
 * <h1> Add helper Method </h1>
 * This method is a helper used for recursion. 
 * @author Raj
 */

    private void add(int x, Node p) {

        if (p.next == null) {
            Node q = new Node();
            q.data = x;
            q.next = null;
            p.next = q;
        } else {
            add(x, p.next);

        }
    }

                /**
 * <h1> Remove Method </h1>
 * This method has been implemented from the Set interface to remove an element 
 * if user intends to. 
 * @author Raj
 */
    @Override
    public void remove(int y) {
        Node q = findPrev(y);
        if (q == null) {
            first = first.next;
            return;
        }
        if (q.next == null) {
            return;

        }
        q.next = q.next.next;
    }

                /**
 * <h1> findPrev Method </h1>
 * This method is used to return the previous node in a linked list.
 * @author Raj
 */
    private Node findPrev(int x) {

        if (isEmpty()) {
            throw new NoSuchElementException("Element does not exist");
        }
        if (first.data == x) {
            return null;
        }
        Node r = first;
        while ((r.next != null) && (r.next.data != x)) {
            r = r.next;
        }
        return r;
    }

                /**
 * <h1> Union Method </h1>
 * This method has been implemented from the Set interface to create a new set
 * that contains the union of two sets.
 * @author Raj
 */
    @Override
    public void union(Set other, Set result) {
        Node p = this.first;
        LL r = (LL) other;
        Node q = r.first;

        while (p != null) {

            result.add(p.data);
            p = p.next;
        }
        while (q != null) {
            result.add(q.data);
            q = q.next;
        }

    }

                /**
 * <h1> Intersection Method </h1>
 * This method has been implemented from the Set interface to create a new set
 * that contains the intersection of two sets.
 * @author Raj
 */
    @Override
    public void intersection(Set other, Set result) {
        intersection(first, other, result);
    }

    private void intersection(Node p, Set other, Set result) {
        if (p == null) {
            return;
        } else if (other.isMember(p.data)) {
            result.add(p.data);

        }
        intersection(p.next, other, result);

    }
              /**
 * <h1> Difference Method </h1>
 * This method has been implemented from the Set interface to create a new set
 * that contains the difference of two sets.
 * @author Raj
 */
    @Override
    public void difference(Set other, Set result) {
        Node p = this.first;

        while (p != null) {
            if (!other.isMember(p.data)) {
                result.add(p.data);
            }
            p = p.next;
        }
    }

                 /**
 * <h1> toString Method </h1>
 * This method has been implemented from the Set interface to output data.
 * @author Raj
 */
    @Override
    public String toString() {

        Node p = first;
        String out = " the following: { ";
        while (p != null) {
            out = out + Integer.toString(p.data) + ",";
            p = p.next;
        }
        return out;
    }
             /**
 * <h1> Equals Method </h1>
 * This method has been implemented from the Set interface to check if two given
 * sets are equal.
 * @author Raj
 */
    @Override
    public boolean equals(Object Other) {
        LL l1 = (LL) Other;
        LL l2 = new LL();
        int x = this.getSize();
        int y = l1.getSize();

        if (x != y) {
            return false;

        } else {
            this.intersection(l1, l2);
            int a = l2.getSize();
            if (a == x && a == y) {
                return true;

            } 
                return false;
            }

        }

    }


