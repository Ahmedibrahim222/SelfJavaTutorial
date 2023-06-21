package learningJava;

import java.util.Scanner;

public class mathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double x;
	double y;
	double z;
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter side x: ");
	x = sc.nextDouble();
	System.out.println("Enter side y: ");
	y = sc.nextDouble();
	
	z = Math.sqrt((x*x)+(y*y));
	
	System.out.println("The hypotenus is : "+z);
		

	}

}
