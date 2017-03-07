package pl.lodz.uni.math.java;

public class Client extends Account {

	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	
	public Client() {
		addDetails();
	}
	
	public void addDetails() {
		firstName = "Jan";
		lastName = "Kowalski";
		city = "Warsaw";
		state = "Mazowieckie";
		zip = "01-003";
		street = "Prosta";
		number = 12;
		accountBalance = 5000; 
	}
	
	public void showDetails() {
		System.out.println("\nClient Name - " + firstName + " " + lastName);
		System.out.println("Account number - " + accountNumber);
		System.out.println("Account balance - " + accountBalance + " PLN");
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n");
	}
	

}
