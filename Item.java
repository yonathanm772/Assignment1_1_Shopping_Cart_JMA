
/** A class of items for sale.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 5.0
*/
public class Item implements Item_Interface {
   private String description;
   private int price;
   private String name;
   
   	/**
   	 * Default constructor with attributes as parameters
   	 * @param productDescription
   	 * @param d
   	 */
	public Item(String productDescription, int d) 
	{
      description = productDescription;
      price = d;
	} // end constructor
	
	/**
	 * Gets the description of an item
	 * @return description as a string
	 */
	public String getDescription() 
	{
      return description;
	} // end getDescription
	
	/**
	 * Gets the price of an item
	 * @return price as int
	 */
	public int getPrice() 
	{
      return price;
	} // end getPrice
	
	/**
	 * Allows to print the item using toString method
	 * return string
	 */
	public String toString() 
	{
      return String.format("%s\t$%d.%02d", description, price /100, price %100);
	} // end toString
	
	/**
	 * Changes the name of an item
	 * @param name of String type
	 */
	@Override
	public void setName( String name) {
		// TODO Auto-generated method stub
		 this.name=name;
	}
	
	/**
	 * Changes the price of an item
	 * @param price of int type
	 */
	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		this.price=price;
	}
	
	/**
	 * Changes the description of an item
	 * @param name of String type
	 */
	@Override
	public void setDescription(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	
	/**
	 * Gets the name of an item 
	 * @return name of String type
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
} // end Item