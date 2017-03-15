package pl.math.uni.lodz.java;

public class Main {

	public static void main(String[] args) {
		BankArray gtAccount = BankArray.getInstance();
		ClientArray client1 = new ClientArray();
		ClientArray client2 = new ClientArray();
		ClientArray client3 = new ClientArray();
		
		ClientArray.clientList.add(client1);
		ClientArray.clientList.add(client2);
		ClientArray.clientList.add(client3);
		
		gtAccount.showDetails();
		
		Transaction operation;

		operation = new Deposit(client1,2500);
		operation.doTransaction();
		Transaction.transactionHistory.add(operation);
		
		operation = new Check(client3,101111111.99);
		operation.doTransaction();
		Transaction.transactionHistory.add(operation);
		
		operation = new Transfer(client1, client2, 760, "PLWDV");
		operation.doTransaction();
		Transaction.transactionHistory.add(operation);
		
		Transaction.checkList();
		
		BankArray.showHistory();
	}

}
