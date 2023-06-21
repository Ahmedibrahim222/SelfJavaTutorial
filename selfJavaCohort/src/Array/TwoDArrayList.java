package Array;

import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList();

		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList();

		produceList.add("vegetable");
		produceList.add("tomatoes");
		produceList.add("lectuce");

		ArrayList<String> drinksList = new ArrayList();

		drinksList.add("soda");
		drinksList.add("coffee");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);

		System.out.println(groceryList.get(0).get(0));


	}

}
