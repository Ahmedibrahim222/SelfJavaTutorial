package overloadedConstructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a pizza object
		Pizza pizza = new Pizza("Thick crust", "Tomato", "Mozzerella", "Pepperoni");
		
		pizza.bake();	
		
			System.out.println("Here are the ingredients of your pizza: " );
			System.out.println(pizza.bread);
			System.out.println(pizza.sauce);
			System.out.println(pizza.cheese);
			System.out.println(pizza.topping);
			
			
			
	}
}

