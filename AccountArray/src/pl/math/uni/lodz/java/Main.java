package pl.math.uni.lodz.java;

public class Main {

	public static void main(String[] args) {
		BankArray gtAccount = BankArray.getInstance();
	
		ClientArray client1 = new ClientArray();
		ClientArray client2 = new ClientArray();
		ClientArray client3 = new ClientArray();
		
		gtAccount.clientList.add(client1);
		gtAccount.clientList.add(client2);
		gtAccount.clientList.add(client3);
		
		gtAccount.showDetails();

		gtAccount.deposit(client2, 2500);
		gtAccount.transfer(client1,client2, 2500);
		gtAccount.showHistory();
		
	}

}
