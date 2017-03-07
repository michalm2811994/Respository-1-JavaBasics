package pl.lodz.uni.math.java;

public interface Operations {

	public void doTransaction();
	public void stopTransaction();
	public void deleteTransaction();
	public void check(Account to, double amount);
	public void transit();
	public void deposit(int amount);
}
