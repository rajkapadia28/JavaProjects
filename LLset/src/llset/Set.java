
package llset;

  /**
 * <h1> Set Class </h1>
 * This class is an interface class where all methods are implemented in the 
 * Linked List class. 
 * @author Raj
 */
public interface Set {
    
  public boolean isEmpty();	// Is the set empty?
  public void makeEmpty();	// Make this set empty.
  public boolean isMember(int x); // Is x a member of this set?
  public void add(int x); 	// Insert an element x in this set.
  public void remove(int y); 	// Delete an element y from this set.
  public void union(Set other, Set result); // result = "this" UNION other
  public void intersection (Set other, Set result); // result = "this" INTERSECTION other
  public void difference (Set other, Set result); // result = "this" - other
  public String toString(); // Overridden toString method that returns the set description as
			    // a String.
  public boolean equals(Object other); // Overridden equals method to check equality of two sets.

    
    
    
}
