package carManufacturerManagementSystem;

import java.util.Scanner;

public class Audi_DS extends Audi implements MaxSpeed {
	private String design;
	
	public Audi_DS() {
		
	}
	public Audi_DS(String model, String color, double price) {
		super(model, color, price);
	}
	public Audi_DS(String model, String color, int noOfGear, float weight, double price, AutoDrive autoDriver, String design) {
		super(model, color, noOfGear, weight, price, autoDriver);
		this.design = design;
	}
	
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}

	public void maxSpeed() {
		System.out.println(0.55 * super.getNoOfGear() * super.getWeight());
	}
	
	public void baseAudiInput(Audi_DS[] ds) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < ds.length; i++) {
			System.out.print("Audi_DS: " + (i+1));
			System.out.print("\nEnter Audi_DS Model: ");
			String model = input.next(); 
			
			System.out.print("Enter Audi_DS Color: ");
			String color = input.next();
			
			System.out.print("Enter Audi_DS Price: ");
			double price = input.nextDouble();
			
			ds[i] = new Audi_DS(model, color, price);
			System.out.println();
		}
	}
	
	public void addAudi_DsCarsInCompleteList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_DS car you want to add in Complete List: ");
		int numberOfAudi_DSCars = input.nextInt();
		if(numberOfAudi_DSCars >= 1) {
			Audi_DS[] ds = new Audi_DS[numberOfAudi_DSCars];
			baseAudiInput(ds);
			
			// File write
			Files.addAudiInfoInFile(ds, Audi.completeList);
		}
	}
	
	public void addAudi_DsCarsInPendingList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_DS car you want to add in Pending List: ");
		int numberOfAudi_DSCars = input.nextInt();
		if(numberOfAudi_DSCars >= 1) {
			Audi_DS[] ds = new Audi_DS[numberOfAudi_DSCars];
			baseAudiInput(ds);
			
			// File write
			Files.addAudiInfoInFile(ds, Audi.pendingList);
		}
	}
	
	public void addAudi_DsCarsInSoldList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_DS car you want to add in Sold List: ");
		int numberOfAudi_DSCars = input.nextInt();
		if(numberOfAudi_DSCars >= 1) {
			Audi_DS[] ds = new Audi_DS[numberOfAudi_DSCars];
			baseAudiInput(ds);
			
			// File write
			Files.addAudiInfoInFile(ds, Audi.soldList);
		}
	}
	
	public void addAudi_DsCarsInOrderList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_DS car you want to add in Order List: ");
		int numberOfAudi_DSCars = input.nextInt();
		if(numberOfAudi_DSCars >= 1) {
			Audi_DS[] ds = new Audi_DS[numberOfAudi_DSCars];
			baseAudiInput(ds);
			
			// File write
			Files.addAudiInfoInFile(ds, Audi.orderList);
		}
	}
	
	@Override
	public String toString() {
		return "Audi_DS: Model: " + super.getModel() + " Color: " + super.getColor() + " Price: " + super.getPrice() + "]";
	}
}
