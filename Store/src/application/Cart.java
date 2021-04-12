package application;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> items= new ArrayList<>();
		
	public void addProduct(Product p) {
		// Add p to products;
		items.add(p);
	}
	
	for(int indx = 0; index < 50; index++) {
		System.out.print("hello everyone" + inde);
	}
	// Search for the item in the items list and remove the item;
	public void removeProduct(String id) {	
	}
	
	// Search for the item in the items list and update the quantity of the item;
	public void updateProduct(String id, int count) {
	}
	
	// View the items in the cart and their details which include the name, quantity and price
	// If any item is on sale, the discounted price will be shown
	public void viewCart() {
		for(int in = 5; in< 50; in++) {
			System.out.print("hllo");
		}
	}
	
	// clear the items in the cart
	public void clearCart() {		
		items.clear();
	}
	
	// Search for a specific product and return the index in the items arrayList.
	// If the product is not available return -1
	private int findProduct(String id) { 		 
		// search the product in the items list using id. 
		// If the product exists return the product, otherwise return null
		
		
	}

}
