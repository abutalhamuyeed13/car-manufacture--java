
package carManufacturerManagementSystem;

public class Audi extends Car{
	public static final String audiInfoCenter = "E:\\Java Project\\src\\carManufacturerManagementSystem";
	public static final String completeList = audiInfoCenter + "\\Complete List.txt";
	public static final String pendingList = audiInfoCenter + "\\Pending List.txt";
	public static final String soldList = audiInfoCenter + "\\Sold List.txt";
	public static final String orderList = audiInfoCenter + "\\Order List.txt";
	
	public AutoDrive autoDriver;
	
	public Audi() {
		
	}
	public Audi(String model, String color, double price) {
		super(model, color, price);	
	}
	public Audi(String model, String color, int noOfGear, float weight, double price, AutoDrive autoDriver) {
		super(model, color, noOfGear, weight, price);
		this.autoDriver = autoDriver;
	}
	

	// Adding all the car's of Audi_EP, Audi_DS, Audi_LT like Complete List.
	public void addAudiesToCompleteList() {
		Audi_EP audiEp = new Audi_EP();
		audiEp.addAudi_EpCarsInCompleteList();
		
		Audi_DS audiDs = new Audi_DS();
		audiDs.addAudi_DsCarsInCompleteList();
		
		Audi_LT audiLt = new Audi_LT();
		audiLt.addAudi_LtCarsInCompleteList();
	}
	
	// Adding all the car's of Audi_EP, Audi_DS, Audi_LT like Pending List.
	public void addAudiesToPendingList() {
		Audi_EP audiEp = new Audi_EP();
		audiEp.addAudi_EpCarsInPendingList();
		
		Audi_DS audiDs = new Audi_DS();
		audiDs.addAudi_DsCarsInPendingList();
		
		Audi_LT audiLt = new Audi_LT();
		audiLt.addAudi_LtCarsInPendingList();
	}
	
	// Adding all the car's of Audi_EP, Audi_DS, Audi_LT like Sold List.
	public void addAudiesToSoldList() {
		Audi_EP audiEp = new Audi_EP();
		audiEp.addAudi_EpCarsInSoldList();
		
		Audi_DS audiDs = new Audi_DS();
		audiDs.addAudi_DsCarsInSoldList();
		
		Audi_LT audiLt = new Audi_LT();
		audiLt.addAudi_LtCarsInSoldList();
	}
	
	// Adding all the car's of Audi_EP, Audi_DS, Audi_LT like Order List.
	public void addAudiesToOrderList() {
		Audi_EP audiEp = new Audi_EP();
		audiEp.addAudi_EpCarsInOrderList();
		
		Audi_DS audiDs = new Audi_DS();
		audiDs.addAudi_DsCarsInOrderList();
		
		Audi_LT audiLt = new Audi_LT();
		audiLt.addAudi_LtCarsInOrderList();
	}
	
	
    // Showing all the car's list like Complete, Pending, Sold, Order.
	public void showAudiInfoFromCompleteList() {
		Files.showAudiInfoFromFile(Audi.completeList);
	}
	
	public void showAudiInfoInFromPendingList() {
		Files.showAudiInfoFromFile(Audi.pendingList);
	}
	
	public void showAudiInfoFromSoldList() {
		Files.showAudiInfoFromFile(Audi.soldList);
	}
	
	public void showAudiInfoFromOrderList() {
		Files.showAudiInfoFromFile(Audi.orderList);
	}
	
	public void engineState() {
		if(super.getNoOfGear() >=1)
			System.out.println("Engine Started");
		else
			System.out.println("Engine Started");
	}
}
