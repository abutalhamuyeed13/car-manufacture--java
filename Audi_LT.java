package carManufacturerManagementSystem;

import java.util.Scanner;

public class Audi_LT extends Audi implements MaxSpeed {
	String headLightPower;
	
	public Audi_LT() {
		
	}
	public Audi_LT(String model, String color, double price) {
		super(model, color, price);
	}
	public Audi_LT(String model, String color, int noOfGear, float weight, double price, AutoDrive autoDriver, String headLightPower) {
		super(model, color, noOfGear, weight, price, autoDriver);
		this.headLightPower = headLightPower;
	}
	
	public String getHeadLightPower() {
		return headLightPower;
	}
	
	public void setHeadLightPower(String headLightPower) {
		this.headLightPower = headLightPower;
	}

	public void maxSpeed() {
		System.out.println(0.65 * super.getNoOfGear() * super.getWeight());
	}
	
	public void baseAudiInput(Audi_LT[] lt) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < lt.length; i++) {
			System.out.print("Audi_LT: " + (i+1));
			System.out.print("\nEnter Audi_LT Model: ");
			String model = input.next(); 
			
			System.out.print("Enter Audi_LT Color: ");
			String color = input.next();
			
			System.out.print("Enter Audi_LT Price: ");
			double price = input.nextDouble();
			
			lt[i] = new Audi_LT(model, color, price);
			System.out.println();
		}
	}
	
	public void addAudi_LtCarsInCompleteList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_LT car you want to add in Complete List: ");
		int numberOfAudi_LTCars = input.nextInt();
		if(numberOfAudi_LTCars >= 1) {
			Audi_LT[] lt = new Audi_LT[numberOfAudi_LTCars];
			baseAudiInput(lt);
			
			// File write
			Files.addAudiInfoInFile(lt, Audi.completeList);
		}	
	}
	
	public void addAudi_LtCarsInPendingList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_LT car you want to add in Pending List: ");
		int numberOfAudi_LTCars = input.nextInt();
		if(numberOfAudi_LTCars >= 1) {
			Audi_LT[] lt = new Audi_LT[numberOfAudi_LTCars];
			baseAudiInput(lt);
			
			// File write
			Files.addAudiInfoInFile(lt, Audi.pendingList);
		}	
	}
	public void addAudi_LtCarsInSoldList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_LT car you want to add in Sold List: ");
		int numberOfAudi_LTCars = input.nextInt();
		if(numberOfAudi_LTCars >= 1) {
			Audi_LT[] lt = new Audi_LT[numberOfAudi_LTCars];
			baseAudiInput(lt);
			
			// File write
			Files.addAudiInfoInFile(lt, Audi.soldList);
		}	
	}
	
	public void addAudi_LtCarsInOrderList() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many Audi_LT car you want to add in Order List: ");
		int numberOfAudi_LTCars = input.nextInt();
		if(numberOfAudi_LTCars >= 1) {
			Audi_LT[] lt = new Audi_LT[numberOfAudi_LTCars];
			baseAudiInput(lt);
			
			// File write
			Files.addAudiInfoInFile(lt, Audi.orderList);
		}	
	}
	
	@Override
	public String toString() {
		return "Audi_LT: Model: " + super.getModel() + " Color: " + super.getColor() + " Price: " + super.getPrice() + "]";
	}
}