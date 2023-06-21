package Polymorphism;

class Go{
	public void Animal() {
		System.out.println("Animals are friendly");
	}
}

class come extends Go{
	@Override
	public void Animal() {
		System.out.println("This is a cat");
	}
}

class run extends Go{
	@Override
	public void Animal() {
		System.out.println("The cat is running");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Go go = new come();
		Go go1 = new run();
		go.Animal();
		go1.Animal();
		
	

	}

}
