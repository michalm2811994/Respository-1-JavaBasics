package pl.math.uni.lodz.java;


public interface OperationsArray {

	public void doTransaction();
	public void stopTransaction();
	public void deleteTransaction();
	public void check(ClientArray from, double amount) ;
	public void transfer(ClientArray from, ClientArray to,double amount);
	public void deposit(ClientArray from, double amount);
}
