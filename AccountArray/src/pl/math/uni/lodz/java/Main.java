package pl.math.uni.lodz.java;

public class Main {

	public static void main(String[] args) {
		BankArray gtaccount = new BankArray();
		ClientArray client1 = new ClientArray();
		ClientArray client2 = new ClientArray();
		ClientArray client3 = new ClientArray();
		
		gtaccount.clientList.add(client1);
		gtaccount.clientList.add(client2);
		gtaccount.clientList.add(client3);
		
		gtaccount.showDetails();
		
		gtaccount.transfer(client1, client3, 1000);
		gtaccount.deposit(client1,560);
		gtaccount.check(client2, 2500);
		gtaccount.showClientList();


	}

}
