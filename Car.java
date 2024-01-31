package carManufacturerManagementSystem;

public abstract class Car {
	private String model;
	private String color;
	private int noOfGear;
	private float weight;
	private double price;
	
	public Car() {
		
	}
	public Car(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;	
	}
	public Car(String model, String color, int noOfGear, float weight, double price) {
		this.model = model;
		this.color = color;
		this.noOfGear = noOfGear;
		this.weight = weight;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfGear() {
		return noOfGear;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}