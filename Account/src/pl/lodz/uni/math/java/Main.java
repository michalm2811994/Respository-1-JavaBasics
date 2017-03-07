package pl.lodz.uni.math.java;

public class Main {

	public static void main(String[] args) {

		Account client1 = new Client();
		Account bank1 = new Bank();
		
		client1.deposit(1000);
		client1.check(bank1, 550);
		
		client1.showDetails();
		bank1.showDetails();
	
		
		

	}

	
}
