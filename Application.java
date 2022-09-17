/**
 * An application to implement a shopping cart which contains a bag of items
 * @author Jonathan Moreira Alsina
 * @version 9/17/2002
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping_Cart myCart= new Shopping_Cart();
		
		Item fruit= new Item("apple",250);
		myCart.add(fruit);
		
		Item vegetable= new Item("pickle",150);
		myCart.add(vegetable);
		myCart.add(vegetable);
		
		Item cookie= new Item("chocolate",200);
		myCart.add(cookie);
		
		Item drink= new Item("sprite",175);
		myCart.add(drink);
		
		System.out.println("This is the amount of items in the shopping cart: " + myCart.getCurrentSize());
		System.out.println("Is the shopping cart empty? " + myCart.isEmpty());
		
		
		
		System.out.println("How many vegetables are in the cart? " + myCart.getFrequencyOf(vegetable));
		System.out.println("Was the vegetable removed? " + myCart.remove(vegetable));
		System.out.println("How many vegetables are in the cart now? " + myCart.getFrequencyOf(vegetable));
		
		System.out.println("Does my cart contains vegetables?" + myCart.contains(vegetable));
		System.out.println("Was the vegetable removed? " + myCart.remove(vegetable));
		System.out.println("Are there any vegetables in the cart now? " + myCart.contains(vegetable));
		
		Object [] tempArray = myCart.toArray();
		
		for( int index = 0; index < tempArray.length; index++)
			System.out.println("These are the elements of the shopping cart: " + tempArray[index]);
		
		System.out.printf("The total price of the items in the shopping cart is: $%d.%02d\n ", myCart.getTotalPrice() / 100, myCart.getTotalPrice() % 100);
		
		myCart.remove();
		System.out.println( "The items in the cart are:\n" + tempArray[0]+ "\n" + tempArray[1] );
		myCart.clear();
		System.out.println("Is the cart empty? " + myCart.isEmpty());
		
	}

}