package pl.math.uni.lodz.java;

import java.util.List;
import pl.math.uni.lodz.java.*;

public class Transaction {

	protected int senderAccountNumber;
	protected int receiverAccountNumber;
	protected String transType;
	protected double amount;
	protected boolean status;
	protected String swift = "";
	public static List<Transaction> transactionHistory;

	public void showTransaction() {
		System.out.println("\nTransaction type - " + this.transType);
		System.out.println("Sender account - " + this.senderAccountNumber + " " + swift);
		if (receiverAccountNumber > 0) {
			System.out.println("Receiver account - " + this.receiverAccountNumber + " ");
		}
		System.out.println("Amount - " + this.amount);
		if (status) {
			System.out.println("Status - Succeed");
		} else {
			System.out.println("Status - Failed");
		}
	}

	protected Client accountSearch(int accountNumber) {
		Client account = null;
		for (int i = 0; i < Client.clientList.size(); i++) {
			if (Client.clientList.get(i).accountNumber == accountNumber) {
				account = Client.clientList.get(i);
			}
		}
		return account;
	}

	protected boolean ifInternal(int accountNumber) {

		boolean ifInternal = false;
		for (int i = 0; i < Client.clientList.size(); i++) {
			if (Client.clientList.get(i).accountNumber == accountNumber) {
				ifInternal = true;
			}
		}
		return ifInternal;
	}

	public static void deleteTransaction(int transactionIndex) {
		if (Transaction.transactionHistory.get(transactionIndex).status == false) {
			Transaction.transactionHistory.remove(transactionIndex);
		}
	}

	static public void checkList() {

		for (int i = 0; i < Transaction.transactionHistory.size(); i++) {
			deleteTransaction(i);
		}
	}

	public static void closeSession() {
		checkList();
		for (int i = 0; i < Transaction.transactionHistory.size(); i++) {
			Transaction.transactionHistory.get(i).finishTransaction();

		}
	}

	public void doTransaction() {
	}

	public void stopTransaction() {

	}

	public void finishTransaction() {
	}

}
