package pl.math.uni.lodz.java;

import java.util.List;
import java.util.ArrayList;

public class BankArray implements OperationsArray{

	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	public List<ClientArray> clientList;

	public BankArray() {
		addDetails();
		clientList = new ArrayList<ClientArray>();
	}

	public void addDetails() {
		name = "GTAccount SA";
		city = "Warsaw";
		state = "Mazowieckie";
		zip = "01-002";
		street = "Fabryczna";
		number = 23;
	}

	public void showDetails() {
		System.out.println("\nBank Name - " + name);
		System.out.println("Registered clients - " + clientList.size());
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n");
	}

	public void showClientList() {

		for (int i = 0; i < clientList.size(); i++) {
			clientList.get(i).showDetails();
		}
	}

	public void transfer(ClientArray from, ClientArray to, double amount) {
		if (from.accountBalance > amount) {
			from.accountBalance -= amount;
			to.accountBalance += amount;
		} else
			System.out.println("\nYour account does not have sufficient funds\n");
	}

	public void doTransaction() {

	}

	public void stopTransaction() {

	}

	public void deleteTransaction() {

	}

	public void check(ClientArray from, double amount) {
		if (from.accountBalance > amount) {
			from.accountBalance -= amount;
		} else
			System.out.println("\nYour account does not have sufficient funds\n");
	}

	public void deposit(ClientArray from, double amount) {
		from.accountBalance += amount;
	}
	
}
