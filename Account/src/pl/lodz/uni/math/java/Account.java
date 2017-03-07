package pl.lodz.uni.math.java;

public class Account implements Operations {
	protected static int accountNumber = 0;
	protected double accountBalance;

	Account() {
		accountNumber += 1;
		;
	}

	public void doTransaction() {

	}

	public void stopTransaction() {

	}

	public void deleteTransaction() {

	}

	public void check(Account to, double amount) {
		if (to.accountBalance > amount) {
			accountBalance -= amount;
			to.accountBalance += amount;
		} else {
			System.out.println("\nYour account does not have sufficient funds\n");
		}
	}

	public void transit() {

	}

	public void showDetails() {
		// Czysta metoda na potrzeby klasy pochodnej
	}

	public void deposit(int amount)
	{
		accountBalance += amount;
	}

}
