public class Sedan extends Car {
	
	/**Procedure:-
	 * ===================================================
	 * 1. Created a Sub Class called Sedan
	 * 2. Created a constructor passing all arguments
	 * 3. Created a method to get the sale price of Sedan 
	 * ===================================================
	 */
	private int length;

	/*
	 * 2. Created a constructor passing all arguments
	 */
	public Sedan(int Speed, double regularPrice, String color, int length) {
		super(Speed, regularPrice, color);
		this.length = length;
	}

	/*
	 * 3. Created a method to get the sale price of Sedan
	 */
	public double getSalePrice() {
		if (length > 20) {
			return super.getSalePrice()-(super.getSalePrice()/20);
		}
		else {  
			return super.getSalePrice()-(super.getSalePrice()/10);
		}
	}
}