public class Car {
	
	/**Procedure:-
	 * =================================================
	 * 1. Created a Super Class
	 * 2. Created a constructor passing all arguments
	 * 3. Created a method to get the sale price of car 
	 * =================================================
	 */
	public int speed;
	private double regularPrice;
	public String color;
	
	/*
	 * 2. Created a constructor passing all arguments
	 */
	public Car(int Speed, double regularPrice, String color) {
		this.speed = Speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	/*
	 * 3. Created a method to get the sale price of car
	 */
	public double getSalePrice() {
		return regularPrice;
	}
}	