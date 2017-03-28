package pl.math.uni.lodz.java;

public class Main {

	public static void main(String[] args) {

		Bank gtAccount = Bank.getInstance();
		Client newAccount;
		Transaction operation;

		newAccount = new PersonalAccount();

		newAccount = new BusinessAccount();

		newAccount = new PersonalAccount();

		operation = new Deposit(1, 1340);
		operation.doTransaction();

		operation = new Check(1, 3, 150);
		operation.doTransaction();

		operation = new Transfer(2, 1, 2500, "PLGTA");
		operation.doTransaction();

		Transaction.closeSession();
		Bank.showHistory();

		Bank.showClientList();

	}

}
