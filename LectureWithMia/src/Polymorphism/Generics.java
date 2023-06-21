package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	// generic class
	public static class People <T>{
		private T value;
		public void setValue(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}
	}

	// generic interface
	public interface myList <T>{
		void add (T element);
		T get (int index);
		int size();

	}

	//this is generic method
	public static <T> void printArray(T[]array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		// generic class

		People <Integer> integerPeople = new People <>();
		integerPeople.setValue(5);
		int value = integerPeople.getValue();
		System.out.println("value " + value);

		People <String> stringPeople = new People <>();
		stringPeople.setValue("Mia");
		String message = stringPeople.getValue();
		System.out.println("message " + message);

		// generic interface

		myList<Integer> integerList = new myList<Integer>() {
			private List <Integer> list = new ArrayList<>();

			public void add (Integer element) {
				list.add(element);

			}
			public Integer get (int index) {

				return list.get(index);
			}
			
			public int size() {
				return list.size();
			}

		};
		integerList.add(5);
		integerList.add(10);
		integerList.add(100);
		
		System.out.println("Integer list : ");
		
		for (int i = 0; i<integerList.size(); i++) {
			System.out.println(integerList.get(i));
		}
		
		// generic method
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		String[] messageArray = {"I", "Love", "You"};
		
		System.out.println("integerArray :");
		printArray(intArray);
		printArray(messageArray);
		
	}



	}



