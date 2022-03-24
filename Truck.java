public class Truck extends Car {

	/**Procedure:-
	 * ==================================================
	 * 1. Created a Sub Class called truck 
	 * 2. Created a constructor passing all arguments
	 * 3. Created a method to get the sale price of Truck
	 * ==================================================
	 */
	
	private int weight;
	/*
	 * 2. Created a constructor passing all arguments
	 */
	public Truck(int Speed, double regularPrice, String color, int weight) {
		super(Speed, regularPrice, color);
		this.weight = weight;
	}

	/*
	 * 3. Created a method to get the sale price of Truck
	 */
	public double getSalePrice() {
		if (weight > 2000){
			return super.getSalePrice()-(super.getSalePrice()/10);
		}
		else {
			return super.getSalePrice()-(super.getSalePrice()/5);
		}
	}
}