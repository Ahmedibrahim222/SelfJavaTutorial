package ahmedDEMO;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int myInt = input.nextInt();
		System.out.printf("You entered %d.%n%n", myInt);

		System.out.print("Enter a double: ");
		double myDouble = input.nextDouble();
		System.out.printf("You entered %.2f.%n%n", myDouble);

		System.out.print("Enter a string: ");

		input.nextLine();
		String myString = input.nextLine();
		System.out.printf("You entered \"%s\".%n%n", myString);

	}

}
