package pl.math.uni.lodz.java;

public class Transfer extends Transaction {

	public Transfer(int senderAcountNumber, int receiverAccountNumber, double amount, String swift) {
		if (ifInternal(senderAcountNumber) == true) {
			this.senderAccountNumber = accountSearch(senderAcountNumber).accountNumber;
		} else {
			this.senderAccountNumber = senderAcountNumber;
		}

		if (ifInternal(receiverAccountNumber) == true) {
			this.receiverAccountNumber = accountSearch(receiverAccountNumber).accountNumber;
		} else {
			this.receiverAccountNumber = receiverAccountNumber;
		}

		this.transType = "Transfer";
		this.amount = amount;
		this.swift = swift;

	}

	@Override
	public void doTransaction() {
		if (this.accountSearch(this.senderAccountNumber).accountBalance >= this.amount
				&& ifInternal(this.senderAccountNumber) == true
				&& this.senderAccountNumber != this.receiverAccountNumber) {
			this.status = true;
		} else {
			this.status = false;
		}
		Transaction.transactionHistory.add(this);
	}

	@Override
	public void finishTransaction() {
		this.accountSearch(this.senderAccountNumber).accountBalance -= this.amount;
		if (ifInternal(this.senderAccountNumber) == true) {
			this.accountSearch(this.receiverAccountNumber).accountBalance += this.amount;
		}
	}

}
