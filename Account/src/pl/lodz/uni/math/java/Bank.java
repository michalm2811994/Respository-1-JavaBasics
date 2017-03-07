package pl.lodz.uni.math.java;

public class Bank extends Account  {

	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	
	
	public Bank(){
		addDetails();
	}
	public void addDetails() {
		name = "GTAccount SA";
		city = "Warsaw";
		state = "Mazowieckie";
		zip = "01-002";
		street = "Fabryczna";
		number = 23;
		accountBalance = 1000000; 
	}
	
	public void showDetails() {
		System.out.println("\nBank Name - " + name);
		System.out.println("Account number - " + accountNumber);
		System.out.println("Account balance - " + accountBalance + " PLN");
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number+ "\n");
	}
	
}
