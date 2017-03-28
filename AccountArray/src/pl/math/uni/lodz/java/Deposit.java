package pl.math.uni.lodz.java;

import java.util.List;

public class Deposit extends Transaction {

	public Deposit(int senderAccountNumber, double amount) {
		if (ifInternal(senderAccountNumber) == true) {

			this.senderAccountNumber = accountSearch(senderAccountNumber).accountNumber;
		} else {
			this.senderAccountNumber = senderAccountNumber;
		}
		this.amount = amount;
		this.transType = "Deposit";
	}

	@Override
	public void doTransaction() {
		if (ifInternal(this.senderAccountNumber) == true) {
			this.status = true;
		} else {
			this.status = false;
		}
		Transaction.transactionHistory.add(this);
	}

	@Override
	public void finishTransaction() {
		this.accountSearch(this.senderAccountNumber).accountBalance += this.amount;
	}

}
