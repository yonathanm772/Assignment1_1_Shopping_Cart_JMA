/**
	 * The implementation of an interface of a shopping cart
	 * @author Jonathan Moreira Alsina
	 * @version 9/1/2022
	 */
public class Shopping_Cart<T> implements Shopping_Cart_Interface <T> {
	
	private ResizableArrayBag <T> cartBag;
	
	/**
	 * Creates a default constructor with the attributes of a shopping cart
	 */
	public Shopping_Cart() {
		cartBag = new ResizableArrayBag<T>();
	
	/**
	 * Checks the current size of the shopping cart
	 * @return size of int type
	 */
	}
	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return cartBag.getCurrentSize();
	}
	
	/**
	 * Checks if the shopping cart is empty
	 * @return true if the shopping cart is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return cartBag.isEmpty();
	}
	
	/**
	 * Adds a new item to the bag inside the shopping cart
	 * @param newItem of type T
	 * @return True if the item was added successfully 
	 */
	@Override
	public boolean add(T newItem) {
		return cartBag.add(newItem);
	}
	
	/**
	 * Removes the last item in the shopping cart
	 */
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return cartBag.remove();
	}
	
	/**
	 * Removes a specific item from the shopping cart
	 * @param anItem of T type
	 * @return True if the item was removes successfully
	 */
	@Override
	public boolean remove(T anItem) {
		// TODO Auto-generated method stub
		return cartBag.remove(anItem);
	}
	
	/**
	 * Clear the whole shopping carts of any items
	 */
	@Override
	public void clear(){
		// TODO Auto-generated method stub
		cartBag.clear();
	}
	
	/**
	 * Gets how many times a single items appears in the shopping cart
	 * @param anItem of T type
	 * @return frequency of anItem as an int
	 */
	@Override
	public int getFrequencyOf(T anItem) {
		// TODO Auto-generated method stub
		return cartBag.getFrequencyOf(anItem);
	}
	
	/**
	 * Checks to see if the shopping cart contains an item
	 * @param anItem of T type
	 * @return True if the item is in the shopping cart
	 */
	@Override
	public boolean contains(T anItem) {
		// TODO Auto-generated method stub
		return cartBag.contains(anItem);
	}
	
	/**
	 * Copies the contents of an Array into another one
	 */
	@Override
	public T [] toArray() {
		// TODO Auto-generated method stub
		return cartBag.toArray();
	}
	
	/**
	 * Gets the total price of all the items in the shopping cart
	 * @return sum of the prices as int type
	 */
	@Override
	public int getTotalPrice() {
		Object [] localBag = cartBag.toArray();
		int sum=0;
		for( int index=0; index<localBag.length; index++) {
				Item i= (Item) localBag[index];
				sum = sum + i.getPrice();
		}
		return sum;
	}	
}