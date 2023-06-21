package Polymorphism;

class Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public double add(double a, double b) {
		return a + b;
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
}


public class User {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(5, 5));
		System.out.println(calculator.add(2, 3, 4));
		System.out.println(calculator.add(2.1, 3.1));

	}
}
