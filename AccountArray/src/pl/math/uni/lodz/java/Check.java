package pl.math.uni.lodz.java;

public class Check extends Transaction {

	public Check(int senderAccountNumber, int receiverAccountNumber, double amount) {

		if (ifInternal(senderAccountNumber) == true) {
			this.senderAccountNumber = accountSearch(senderAccountNumber).accountNumber;
		} else {
			this.senderAccountNumber = senderAccountNumber;
		}

		if (ifInternal(receiverAccountNumber) == true) {
			this.receiverAccountNumber = accountSearch(receiverAccountNumber).accountNumber;
		} else {
			this.receiverAccountNumber = receiverAccountNumber;
		}

		this.transType = "Check";
		this.amount = amount;
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
			System.out.println();
		}

	}

}
