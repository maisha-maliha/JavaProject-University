package application;

import java.time.LocalDate;

public class FoodItem{	 // make this a subclass of Product
	private LocalDate mfgDate, expirationDate;
	
	// constructor
	public FoodItem(String name, String id, int quantity, LocalDate mfg, LocalDate exp,double price) {
		;
	}

	// This method will put an item on sale if the item expires 
	// within next few days which will be decided by the admin.
	@Override
	public void putOnSale(Object criterion, int p) {
		
	}
	
	// This details method is for admin user. Admin should be able to see everything.
	public String details() {
		
	}	
}
