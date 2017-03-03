package pl.lodz.uni.lodz.java;

public class Main {

	public static void main(String[] args) {
	
		Employee empl = new Employee("Kowalski Marian", "Junior Developer", 23, 3400);
		empl.changeSalary(3600);
		empl.printData();
		
	}
}
