package loops;

import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 50;
		
		if(temp>50) {
			System.out.println("It is boiling outside");
			
		}
		else if(temp>=50 && temp<=55) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = sc.next();
		
		if(response.equals("q")|| response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}

	}

}
