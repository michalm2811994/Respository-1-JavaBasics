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
	public List<ClientArray> clientList;
	public List<Transaction> transactionHistory;
	private static BankArray instance = new BankArray();
	private BankArray() {
		addDetails();
		clientList = new ArrayList<ClientArray>();
		transactionHistory = new ArrayList<Transaction>();
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
		System.out.println("Registered clients - " + clientList.size());
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + number + "\n");
	}

	public void showClientList() {

		for (int i = 0; i < clientList.size(); i++) {
			clientList.get(i).showDetails();
		}
	}
	Transaction newTransaction;

	public void check(ClientArray sender, double amount) {

		newTransaction.transType = TransactionType.type.check;
		newTransaction = new Transaction(sender, amount);
		if (sender.accountBalance > amount) {
			newTransaction.status = true;
		} else {
			newTransaction.status = false;
		}
		transactionHistory.add(newTransaction);
	}

	public void deposit(ClientArray sender, double amount) {
		newTransaction = new Transaction(sender, amount);
		newTransaction.transType = TransactionType.type.deposit;
		newTransaction.status = true;	
		this.transactionHistory.add(newTransaction);	
	}

	public void transfer(ClientArray sender, ClientArray reciver, double amount) {
		newTransaction = new Transaction(sender, reciver, amount);
		newTransaction.transType = TransactionType.type.transfer;
		if (sender.accountBalance > amount && sender.accountNumber != reciver.accountNumber) {
			newTransaction.status = true;
		} else {
			newTransaction.status = false;
		}
		transactionHistory.add(newTransaction);
	}
	
	public void showHistory() {

		for (int i = 0; i < transactionHistory.size(); i++) {
			transactionHistory.get(i).showTransaction();
		}
	}
	
	
}
