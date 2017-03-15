package pl.math.uni.lodz.java;

public class Transfer extends Transaction {
	

	
	public Transfer(ClientArray sender,ClientArray receiver, double amount, String swift) {
		this.senderAccountNumber = sender.accountNumber;
		this.receiverAccountNumber = receiver.accountNumber;
		this.transType = TransactionType.type.check;
		this.amount = amount;
		this.accountBalance = sender.accountBalance;
		this.swift = swift;
	}
	
	@Override
	public void doTransaction() {
		this.transType = TransactionType.type.transfer;
		if (this.accountBalance > amount && this.senderAccountNumber != this.receiverAccountNumber) {
			this.status = true;
		} else {
			this.status = false;
		}

	}


}
