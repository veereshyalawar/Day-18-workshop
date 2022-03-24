public class Main {
	
	/**
	 * Procedure:-
	 * =====================================================
	 * 1. Calling method of sub classes and passing arguments
	 * 2. Printing all the instances
	 * =====================================================
	 */
	int Speed;
	double regularPrice;
	String color; 
	int year;
	int manufacturerDiscount;
	public static void main(String[] args) {

		/*
		 * 1. Calling method of sub classes and passing arguments
		 */
		Truck myTruck = new Truck(125,80000,"Blue",1800);
		Ford myFord1 = new Ford (156,62452.0,"Black",2005, 10);
		Ford myFord2 = new Ford (155,57000.0,"White",1998, 5);
		Sedan mySedan = new Sedan(160, 30000, "Grey", 10);
		Car myCar = new Car (185, 30856.0, "Red");
		
		System.out.println("----My Own Auto Shop----");
		/*
		 * 2. Printing all the instances
		 */
		System.out.println("MyTruck Price: " +myTruck.getSalePrice());
		System.out.println("MyFord1 Price: " +myFord1.getSalePrice());
		System.out.println("MyFord2 Price: " +myFord2.getSalePrice());
		System.out.println("MySedan Price: " +mySedan.getSalePrice());
		System.out.println("MyCar Price  : " +myCar.getSalePrice());
		
		}

}