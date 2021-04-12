package application;


public class Clothing  {// make this a subclass of Product
	private String brand;
	private SubCategory subCategory; // Can use String as well
	private Size size; // Can avaoid enum if you want

	// constructor
	

	// getter/setter
	


	// Override the putOnSale method
	// This method will put an item on sale and also set the sale percentage
	// The item id ans sale percentage will be decided by the admin.
	@Override
	public void putOnSale(Object id, int percentage) {
		
	}

	// This details method is for admin user. Admin should be able to see everything.
	// Call details method of parent class and add other info specific to this class
	public String details() {
		
	}

}
enum SubCategory{
	MEN,
	WOMEN,
	KIDS,
	GIRLS
}
enum Size{
	SMALL,
	MEDIUM,
	LARGE,
	XL,
	XXL
}
