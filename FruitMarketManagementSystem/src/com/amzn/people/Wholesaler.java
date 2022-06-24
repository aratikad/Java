package com.amzn.people;

import java.math.BigDecimal;

public class Wholesaler {

	public String name;
	public int mob;
	public String email;
	public static int inventory;
	long accountNumber;
	private double accountBalance;
	private BigDecimal profit;
	
	// make YEAR_OF_LICENSE as constant 
	final private int YEAR_OF_LICENSE=1999; 
	
	Farmer[] clientFarmerList;
	int farmerListCounter=0;	

	public Wholesaler() {		
	}

	public Wholesaler(String Name, int Phone, String Email) {
		this.name = Name;
		this.mob = Phone;
		this.email = Email;
		clientFarmerList = new Farmer[100];
	}

	public void sellProducts(String productName, int quantity) {
		System.out.println("Selling Products");
		inventory = inventory - quantity;
		updateAccountBalnce(quantity * 1.22);
	}

	private void updateAccountBalnce(double d) {

	}

	public void addFarmer(Farmer farmer) {
		clientFarmerList[farmerListCounter] = farmer;
		farmerListCounter++;
		
		//client.name="-------"; name is private so we can update name
		//client.setName(this, "-------");		
	}
	
	public int getYearOfLicense(){
		return this.yearOfLicense;
	}
	
	
	
	public String displayMyDetails() {
		return "Hi, I am a whole saler. Here are my details:\n"
	+"name = "+ this.name 
	+ "\n No of farmers associated with me = "+	farmerListCounter;
	}
}
