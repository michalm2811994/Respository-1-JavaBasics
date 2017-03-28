package pl.math.uni.lodz.java;

public class BusinessAccount extends Client {
	
	private String companyName;
	
	
	BusinessAccount() {
		accountNumberCounter++;
		addDetails();
		Client.clientList.add(this);
	}
	
	public void addDetails() {
		this.companyName = "ARC Digital";
		this.city = "Warsaw";
		this.state = "Mazowieckie";
		this.zip = "01-003";
		this.street = "Cybernetyki";
		this.number = 23;
		this.accountNumber = accountNumberCounter;
		this.accountBalance = 250000;
		this.accountType = "Business Account";
	}
	
	public void showDetails() {
		System.out.println("\nCompany Name - " + companyName);
		System.out.println("Account number - " + accountNumber);
		System.out.println("Account balance - " + accountBalance + " PLN");
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number);
		System.out.println("Type - " + accountType + "\n");
	}
}
