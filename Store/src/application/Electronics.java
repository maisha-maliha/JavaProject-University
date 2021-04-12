package application;


public class Electronics { // make this a subclass of Product
	private String manufacturer;
	private ElectCategory subCategory; // Can be String or other data type as well
	
	// Constructor
	public Electronics(String name, String id, int quantity, String manufacturer, ElectCategory subCategory, double price) {
		
	}
	
	// getter/setter
	
	
	// Override the putOnSale method
	// This method will put an item on sale and also set the sale percentage
	// The item id ans sale percentage will be decided by the admin.
	@Override
	public void putOnSale(Object id, int percentage) {
		
	}
	
	// This details method is for admin user. Admin should be able to see everything.
	public String details() {
		
}

enum ElectCategory{
	HOME_APPLIANCE,
	KITCHEN_APPLIANCE,
	ELECTRONIC_DEVICE,
	ELECTRONIC_ACCESSORY
}
