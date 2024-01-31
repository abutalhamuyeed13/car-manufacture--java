package carManufacturerManagementSystem;

import java.util.Scanner;

public class Audi_EP extends Audi implements MaxSpeed {
	private float enginePower;
	
	public Audi_EP() {
		
	}
	public Audi_EP(String model, String color, double price) {
		super(model, color, price);
	}
	public Audi_EP(String model, String color, int noOfGear, float weight, double price, AutoDrive autoDriver, float enginePower) {
		super(model, color, noOfGear, weight, price, autoDriver);
		this.enginePower = enginePower;;
	}
	
	public float getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(float enginePower) {
		this.enginePower = enginePower;
	}
	
	public void maxSpeed() {
		System.out.println(0.25 * super.getNoOfGear() * super.getWeight());
	}
	public void baseAudiInput(Audi_EP[] ep) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < ep.length; i++) {
			System.out.print("Audi_EP: " + (i+1));
			System.out.print("\nEnter Audi_EP Model: ");
			String model = input.next(); 
			
			System.out.print("Enter Audi_EP Color: ");
			String color = input.next();
			
			System.out.print("Enter Audi_EP Price: ");
			double price = input.nextDouble();
			
			ep[i] = new Audi_EP(model, color, price);
			System.out.println();
		}
	}
	
	public void addAudi_EpCarsInCompleteList() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many Audi_EP car you want to add in complete list: ");
		int numberOfAudi_EPCars = input.nextInt();
		if(numberOfAudi_EPCars >= 1) {
			Audi_EP[] ep = new Audi_EP[numberOfAudi_EPCars];
			baseAudiInput(ep);
			
			// File write
			Files.addAudiInfoInFile(ep, Audi.completeList);
		}
	}
	
	public void addAudi_EpCarsInPendingList() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many Audi_EP car you want to add in Pending List: ");
		int numberOfAudi_EPCars = input.nextInt();
		if(numberOfAudi_EPCars >= 1) {
			Audi_EP[] ep = new Audi_EP[numberOfAudi_EPCars];
			baseAudiInput(ep);
			
			// File write
			Files.addAudiInfoInFile(ep, Audi.pendingList);
		}
		
	}
	
	public void addAudi_EpCarsInSoldList() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many Audi_EP car you want to add in Sold List: ");
		int numberOfAudi_EPCars = input.nextInt();
		if(numberOfAudi_EPCars >= 1) {
			Audi_EP[] ep = new Audi_EP[numberOfAudi_EPCars];
			baseAudiInput(ep);
			
			// File write
			Files.addAudiInfoInFile(ep, Audi.soldList);
		}
	}
	
	public void addAudi_EpCarsInOrderList() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nHow many Audi_EP car you want to add in Order List: ");
		int numberOfAudi_EPCars = input.nextInt();
		if(numberOfAudi_EPCars >= 1) {
			Audi_EP[] ep = new Audi_EP[numberOfAudi_EPCars];
			baseAudiInput(ep);
			
			// File write
			Files.addAudiInfoInFile(ep, Audi.orderList);
		}
	}
	
	@Override
	public String toString() {
		return "Audi_Ep: Model: " + super.getModel() + " Color: " + super.getColor() + " Price: " + super.getPrice() + "]";
	}
}