package Methods;

public class overLoadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 20;
//		
//		System.out.println(add(a,b));
//		System.out.println(add(a,b,c));
		System.out.println(add(a,b,c,d));
		
//		int x = add(5,10,15,20);
//		
//		System.out.println(x);

	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;

	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;

	}
}
