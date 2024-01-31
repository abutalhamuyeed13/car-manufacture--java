package carManufacturerManagementSystem;

import java.util.Scanner;

public class CarManufactureAdmin {
	
	CarManufactureAdmin(){
		
	}
	
	public void startUp(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t\t******************************************************************");
		System.out.println("\t\t\t--------Welcome to Audi Car Manufacture Management System:--------");
		System.out.println("\t\t\t******************************************************************");
		
		System.out.print("Enter Admin Email: ");
		String adminEmail = input.nextLine();
		
		System.out.print("Enter Admin Password: ");
		String adminPassword = input.nextLine();
		System.out.println();
		
		int counterLoginTrial = 0;;
		while(counterLoginTrial<3) {
			if ((adminEmail.equalsIgnoreCase("admin@gmail.com")) && (adminPassword.equals("1234"))) {
				boolean flag = true;
				while (flag) {
					System.out.println("\tMenu: ");
					System.out.println("\t1. Add car in Complete List: ");
					System.out.println("\t2. Show car from Complete List: ");
					System.out.println("\t3. Add car in Pending List: ");
					System.out.println("\t4. Show car from Pending List: ");
					System.out.println("\t5. Add car in Sold List: ");
					System.out.println("\t6. Show car from Sold List: ");
					System.out.println("\t7. Add car in Order List: ");
					System.out.println("\t8. Show car from Order List: ");
					System.out.println("\t0. Exit: ");

					
					System.out.print("\n\tEnter Option: ");
					int option = input.nextInt();
					switch (option) {
					case 1:
						addingCompleteCarManager();
						continue;
					case 2:
						showingCompleteCarManager();
						continue;
					case 3:
						addingPendingCarManager();
						continue;
					case 4:
						showingPendingCarManager();
						continue;
					case 5:
						addingSoldCarManager();
						continue;
					case 6:
						showingSoldCarManager();
						continue;
					case 7:
						addingOrderCarManager();
						continue;
					case 8:
						showingOrderCarManager();
						continue;
					default :
						System.out.print("Operation End. Thanks for Using");
						System.exit(option);
					}
				}
			}
			else {
				System.out.println("Invalid Information. Enter Correct one. ");
				System.out.print("Enter Admin Name: ");
				adminEmail = input.nextLine();
				
				System.out.print("Enter Admin Pssword: ");
				adminPassword = input.nextLine();
				System.out.println();
				
				counterLoginTrial++;
				if(counterLoginTrial == 2) {
					System.out.println("Currently You are blocked");
					break;
				}
			}
		}
		System.out.println("Try again later with valid info.");
		System.out.println("Thanks.");
	}
	
	public void addingCompleteCarManager() {
		Audi audi = new Audi();
		audi.addAudiesToCompleteList();	
		System.out.println("Successfully Added all the cars in Completed car list\n\n");
	}
	
	public void addingPendingCarManager() {
		Audi audi = new Audi();
		audi.addAudiesToPendingList();	
		System.out.println("Successfully Added all the cars in Pending car list\n\n");
	}
	
	public void addingSoldCarManager() {
		Audi audi = new Audi();
		audi.addAudiesToSoldList();	
		System.out.println("Successfully Added all the cars in sold car list\n\n");
	}

	public void addingOrderCarManager() {
		Audi audi = new Audi();
		audi.addAudiesToOrderList();	
		System.out.println("Successfully Added all the cars in Order car list\n\n");
	}
	
	public void showingCompleteCarManager() {
		Audi audi = new Audi();
		System.out.println("\nList of completed cars: ");
		audi.showAudiInfoFromCompleteList();
	}
	
	public void showingPendingCarManager() {
		Audi audi = new Audi();
		System.out.println("\nList of pending cars: ");
		audi.showAudiInfoInFromPendingList();
	}
	
	public void showingSoldCarManager() {
		Audi audi = new Audi();
		System.out.println("\nList of Sold cars: ");
		audi.showAudiInfoFromSoldList();
	}
	
	public void showingOrderCarManager() {
		Audi audi = new Audi();
		System.out.println("List of Order cars: ");
		audi.showAudiInfoFromOrderList();
	}
}