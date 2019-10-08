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
	private String history = "0";
	
	/**
	 * The constructor sets <code>total</code> to 0 by default whenever a new
	 * <code>AddingMachine</code> is instantiated.
	 */
	public AddingMachine() 
	{
		this.total = 0;
	}
	
	/**
	 * Used to access <code>total</code> outside the scope of this class.
	 * @return the current value of <code>total</code>
	 */
	public int getTotal() 
	{
		return this.total;
	}
	
	/**
	 * Adds an integer to <code>total</code>. Updates <code>history</code> accordingly.
	 * 
	 * @param value is an integer to add to <code>total</code>
	 */
	public void add(int value) 
	{
		this.total += value;
		
		this.history += " + " + value;
	}
	
	/**
	 * Subtracts an integer from <code>total</code>. Updates <code>history</code> 
	 * accordingly.
	 * 
	 * @param value is the integer to subtract from <code>total</code>
	 */
	public void subtract(int value) 
	{
		this.total -= value;
		
		this.history += " - " + value;
	}
	
	/**
	 * @return a string representation of the history of the operations an object of 
	 * <code>AddingMachine</code> has performed.
	 */
	public String toString() 
	{
		return this.history;
	}

	/**
	 * Clears the history of an <code>AddingMachine</code> object by setting it to the
	 * default value. Also clears <code>total</code> to the default value.
	 */
	public void clear() 
	{
		this.total = 0;
		this.history = "0";
	}
}
