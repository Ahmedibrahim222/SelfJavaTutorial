package Encapsulation;

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	//constructor of the class
	Car(String make, String model, int year){
		
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	//getter method is used to print in the main class because it is private.
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	// setter methods is used to change values in the main class because it's private
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
