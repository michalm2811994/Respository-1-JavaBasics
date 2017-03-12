package pl.math.uni.lodz.java;



public class Transaction {

	protected int senderAccountNumber;
	protected int receiverAccountNumber;
	protected TransactionType.type transType;
	protected double amount;
	protected boolean status;
	

	protected Transaction(ClientArray sender, ClientArray reciver, double amount) {
		this.senderAccountNumber = sender.accountNumber;
		this.receiverAccountNumber = reciver.accountNumber;
		this.amount = amount;
	}

	protected Transaction(ClientArray sender, double amount) {
		this.senderAccountNumber = sender.accountNumber;
		this.receiverAccountNumber = 0;
		this.amount = amount;
	}

	public void doTransaction() {

	}

	public void stopTransaction() {

	}

	public void deleteTransaction() {

	}

	public void showTransaction() {
		System.out.println("\nTransaction type - " + transType);
		System.out.println("Sender account - " + senderAccountNumber);
		if(receiverAccountNumber > 0) {
		System.out.println("Reciver account - " + receiverAccountNumber);
		}
		System.out.println("Amount - " + amount);
		if(status) {
			System.out.println("Status - Succeed");
		} else {
			System.out.println("Status - Failed");
		}
	}
	


	
	
}
