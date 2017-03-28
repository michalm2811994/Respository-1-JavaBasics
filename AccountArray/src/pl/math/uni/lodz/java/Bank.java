package pl.math.uni.lodz.java;

import java.util.List;
import java.util.ArrayList;

public class Bank {

	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	private static Bank instance = new Bank();

	private Bank() {
		addDetails();
		Client.clientList = new ArrayList<Client>();
		Transaction.transactionHistory = new ArrayList<Transaction>();

	}

	public static Bank getInstance() {
		return instance;
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
		System.out.println("Registered clients - " + Client.clientList.size());
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n\n");
	}

	static public void showClientList() {

		for (int i = 0; i < Client.clientList.size(); i++) {
			Client.clientList.get(i).showDetails();
		}
	}

	static public void showHistory() {

		for (int i = 0; i < Transaction.transactionHistory.size(); i++) {
			Transaction.transactionHistory.get(i).showTransaction();
		}
	}

}
