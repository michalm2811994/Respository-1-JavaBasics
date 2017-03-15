package pl.math.uni.lodz.java;



import java.util.List;
import java.util.ArrayList;

public class BankArray {

	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private int number;
	private static BankArray instance = new BankArray();
	private BankArray() {
		addDetails();
		ClientArray.clientList = new ArrayList<ClientArray>();
		Transaction.transactionHistory = new ArrayList<Transaction>();
	}

	public static BankArray getInstance() {
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
		System.out.println("Registered clients - " + ClientArray.clientList.size());
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n");
	}

	static public void showClientList() {

		for (int i = 0; i < ClientArray.clientList.size(); i++) {
			ClientArray.clientList.get(i).showDetails();
		}
	}

	static public void showHistory() {

		for (int i = 0; i < Transaction.transactionHistory.size(); i++) {
			Transaction.transactionHistory.get(i).showTransaction();
		}
	}
	
	
}
