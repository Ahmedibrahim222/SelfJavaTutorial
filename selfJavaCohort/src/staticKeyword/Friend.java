package staticKeyword;

public class Friend {
	
	String name;
	static int numberOfFriends;
	
	Friend(String name){
		this.name = name;
		numberOfFriends++;
	}
	
	//using method to display our message
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+" friends");
	}

}
