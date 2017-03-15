package pl.math.uni.lodz.java;


public class Check extends Transaction  {
		
	public Check(ClientArray sender, double amount) {
		this.senderAccountNumber = sender.accountNumber;
		this.receiverAccountNumber = 0;
		this.transType = TransactionType.type.check;
		this.amount = amount;
		this.accountBalance = sender.accountBalance;
	}

	@Override
	 public void doTransaction() {
		 
		if (accountBalance > amount) {
			this.status = true;
		} else {
			this.status = false;
		}
		
	}

	
	
}
