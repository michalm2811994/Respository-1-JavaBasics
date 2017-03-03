package pl.lodz.uni.lodz.java;

public class Employee {
	private String name;
	private String position;
	private int age;
	private double salary;
	
	public Employee(String newName, String newPosition, int newAge, double newSalary) {
		name = newName;
		position = newPosition;
		age = newAge;
		salary = newSalary;
	}
	
	public void printData() {
		System.out.println("Name - " + name);
		System.out.println("Position - " + position);
		System.out.println("Age - " + age);
		System.out.println("Salary - " + salary + " PLN");
	}	 
	
	public void changeSalary(double newSalary){
		salary = newSalary;
	}
}
	

