package learningJava;

import java.util.Random;

public class randomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int x = random.nextInt(6);
		
		System.out.println(x);

	}

}
