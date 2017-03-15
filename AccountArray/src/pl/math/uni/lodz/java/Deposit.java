package pl.math.uni.lodz.java;

import java.util.List;

public class Deposit extends Transaction {
		
	public Deposit(ClientArray sender, double amount) {
		this.senderAccountNumber = sender.accountNumber;
		this.receiverAccountNumber = 0;
		this.transType = TransactionType.type.deposit;
		this.amount = amount;
	}
	
	@Override
	public void doTransaction() {
		this.status = true;	

	}

}
