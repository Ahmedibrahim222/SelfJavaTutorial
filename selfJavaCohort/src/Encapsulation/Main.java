package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//					can be accessed only through methods(getters & setters).
		//					You should make attributes private if you don't have a reason to make them public/protected
		
		//car object
		Car car = new Car("Toyota", "Camry", 2022);
		
		//using the setter method to make changes to the year of car
		car.setYear(2025);
		
		//using the getter method to print
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		

	}

}
