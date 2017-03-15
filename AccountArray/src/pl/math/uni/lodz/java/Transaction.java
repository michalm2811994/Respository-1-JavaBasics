package pl.math.uni.lodz.java;

import java.util.List;

public class Transaction {

	public static List<Transaction> transactionHistory;
	protected int senderAccountNumber;
	protected int receiverAccountNumber;
	protected TransactionType.type transType;
	protected double amount;
	protected boolean status;
	protected double accountBalance;
	protected String swift = "";
	
	
	public void showTransaction() {
		System.out.println("\nTransaction type - " + this.transType);
		System.out.println("Sender account - " + this.senderAccountNumber);
		if(receiverAccountNumber > 0) {
		System.out.println("Reciever account - " + this.receiverAccountNumber + " " + swift);
		}
		System.out.println("Amount - " + this.amount);
		if(status) {
			System.out.println("Status - Succeed");
		} else {
			System.out.println("Status - Failed");
		}
	}

	
	public void doTransaction() { }
	
	public void stopTransaction() { }
	
	public static void deleteTransaction(int transactionIndex) { 
		if(transactionHistory.get(transactionIndex).status == false) {
			transactionHistory.remove(transactionIndex);
	}
	}

	static public void checkList() {
		
		for(int i = 0; i < transactionHistory.size(); i++)	{
				deleteTransaction(i);
			}
		}
		
	}


	
	
	

