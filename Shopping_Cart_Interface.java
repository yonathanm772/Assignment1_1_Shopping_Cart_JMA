/**
	 * An interface that describes the operations of a shopping cart of items.
	 * @author jmoreiraalsina
	 * @version 9/1/2022
	 */
public interface Shopping_Cart_Interface<T> {
	
	/**
	 * Gets the current number of items in this shopping cart
	 * @return the integer number of items currently in the shopping cart
	 */
	public int getCurrentSize();
	
	/**
	 * Check if the shopping cart is empty
	 * @return if the shopping cart is empty
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * Adds an item to the shopping cart
	 * @return if the the item was successfully added
	 */
	public boolean add( T newItem );
	
	/**
	 * Remove the last item placed in the shopping cart
	 * @return the object of T type
	 */
	public T remove();
	
	/**
	 * 
	 * Remove a certain item from the shopping cart
	 * @return if the item was successfully removed
	 * @param item of T type
	 */
	public boolean remove(T anItem);
	
	/**
	 * Clears all the items in the shopping
	 */
	public void clear();
	
	/**
	 * Count the amount of times one item is repeated
	 * @return integer 
	 * @param Item of T type
	 */
	public int getFrequencyOf(T anItem);
	
	/**
	 * Returns true if the item is in the shopping cart
	 * @param	item of T type
	 * @return	true if item is in there
	 */
	public boolean contains( T anItem);
	
	/**
	 * Converts a list of items to an array
	 * @return items as an array
	 */
	public T [] toArray();
	
	/**
	 * Returns an item as a string
	 * @return item as a string
	 */
	public String toString();
	
	/**
	 * Calculates the total price of all the items in the shopping cart
	 * @return total price as a double
	 */
	public int getTotalPrice();
	
}