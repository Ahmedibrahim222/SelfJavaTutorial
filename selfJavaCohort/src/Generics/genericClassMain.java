package Generics;

public class genericClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 9);
		MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 1.2);
		MyGenericClass <Character, Character> myChar = new MyGenericClass<>('@', '+');
		MyGenericClass <String, Integer> myString = new MyGenericClass<>("Hello", 80);
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());

	}

}
