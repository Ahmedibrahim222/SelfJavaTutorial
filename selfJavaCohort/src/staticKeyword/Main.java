package staticKeyword;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend friend1 = new Friend("Peter");
		Friend friend2 = new Friend("Jane");
		Friend friend3 = new Friend("Joy");
		
		System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
	}

}
