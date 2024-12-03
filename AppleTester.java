//
// Ainsley Weaver
// CSCE 145 Section 21
//

public class AppleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the Apple Tester\n");
		System.out.println("Creating a default apple:");
		Apple apple1 = new Apple();
		System.out.println(apple1 + "\n");
		
		System.out.println("Creating another apple:");
		System.out.println("Setting the new apple's values to the following, valid values 'Granny Smith 0.75 0.99'");
		Apple apple2 = new Apple();
		apple2.setType("Granny Smith");
		apple2.setWeight(0.75);
		apple2.setPrice(0.99);
		System.out.println(apple2 + "\n");
		
		System.out.println("Creating another default apple:");
		System.out.println("Then setting the new apple's values to the following, invalid values 'iPad 2.5 -200'");
		Apple apple3 = new Apple();
		apple3.setType("iPad");
		apple3.setWeight(2.5);
		apple3.setPrice(0.0);
		System.out.println(apple3 + "\n");
		
		
		System.out.println("Checking if first and last apple have the same values.");
		System.out.println(apple1.toString().equals(apple3.toString()));
	}

}
