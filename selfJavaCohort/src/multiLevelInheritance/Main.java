package multiLevelInheritance;

 class Animal {

	public void eat() {
		System.out.println("This animal is eating");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("The dog goes brrrr");
	}
}

class Cat extends Dog{
	public void play() {
		System.out.println("The cat goes meooow");
	}

}

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		myCat.eat();
		myCat.bark();
		myCat.play();


	}
}


