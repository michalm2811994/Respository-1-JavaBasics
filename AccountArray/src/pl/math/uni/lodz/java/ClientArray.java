package pl.math.uni.lodz.java;

public class ClientArray {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	protected double accountBalance;
	private static int accountNumberCounter = 1;
	private int accountNumber;

	public ClientArray() {
		addDetails();
		accountNumberCounter++;
	}

	public void addDetails() {
		firstName = "Jan";
		lastName = "Kowalski";
		city = "Warsaw";
		state = "Mazowieckie";
		zip = "01-003";
		street = "Prosta";
		number = 12;
		accountNumber = accountNumberCounter;
		accountBalance = 5000;
	}

	public void showDetails() {
		System.out.println("\nClient Name - " + firstName + " " + lastName);
		System.out.println("Account number - " + accountNumber);
		System.out.println("Account balance - " + accountBalance + " PLN");
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n");
	}
	
	
}
