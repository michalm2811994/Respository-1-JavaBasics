package pl.math.uni.lodz.java;

public class PersonalAccount extends Client {

	private String firstName;
	private String lastName;

	PersonalAccount() {
		accountNumberCounter++;
		addDetails();
		Client.clientList.add(this);
	}

	public void addDetails() {
		this.firstName = "Jan";
		this.lastName = "Kowalski";
		this.city = "Warsaw";
		this.state = "Mazowieckie";
		this.zip = "01-003";
		this.street = "Prosta";
		this.number = 12;
		this.accountNumber = accountNumberCounter;
		this.accountBalance = 5000;
		this.accountType = "Personal Account";
	}

	public void showDetails() {
		System.out.println("\nClient Name - " + firstName + " " + lastName);
		System.out.println("Account number - " + accountNumber);
		System.out.println("Account balance - " + accountBalance + " PLN");
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number);
		System.out.println("Type - " + accountType + "\n");
	}

}
