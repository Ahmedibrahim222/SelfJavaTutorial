package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		Car car = new Car();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		//this attribute is unique to the car class
		System.out.println(car.doors);
		
		//this attribute is unique to the bike class
		System.out.println(bike.pedals);

	}

}
