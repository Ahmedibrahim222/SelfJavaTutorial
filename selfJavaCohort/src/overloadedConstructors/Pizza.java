package overloadedConstructors;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;

	Pizza(String bread, String sauce, String cheese,String topping ){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	void bake() {
		System.out.println("I want to bake pizza with some ingredients and where are my ingredients?");
	}

}
