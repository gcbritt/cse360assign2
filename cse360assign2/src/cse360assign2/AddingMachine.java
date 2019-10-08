package cse360assign2;

/**
 * An adding machine. 
 * Contains methods to add and subtract numbers.
 * 
 * @author Greyson Britt
 */
public class AddingMachine 
{
	private int total;
	
	/**
	 * The constructor sets <code>total</code> to 0 by default whenever a new
	 * <code>AddingMachine</code> is instantiated.
	 */
	public AddingMachine() 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Used to access <code>total</code> outside the scope of this class.
	 * @return the current value of <code>total</code>
	 */
	public int getTotal() 
	{
		return 0;
	}
	
	/**
	 * Adds an integer to <code>total</code>
	 * 
	 * @param value is an integer to add to <code>total</code>
	 */
	public void add(int value) 
	{
		
	}
	
	/**
	 * Subtracts an integer from <code>total</code>
	 * 
	 * @param value is the integer to subtract from <code>total</code>
	 */
	public void subtract(int value) 
	{
		
	}
	
	/**
	 * @return a string representation of the history of the operations an object of 
	 * <code>AddingMachine</code> has performed.
	 */
	public String toString() 
	{
		return "";
	}

	/**
	 * Clears the history of an <code>AddingMachine</code> object.
	 */
	public void clear() 
	{
	
	}
}
