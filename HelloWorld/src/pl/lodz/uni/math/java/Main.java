package pl.lodz.uni.math.java;

public class Main {

	public static void main(String[] args) {

		Hello helloObliect = new Hello();
		helloObliect.sayHello();
		
		System.out.println("Test");
		int intVariable = 10;
		double doubleVariable = 10.55;
		float floatVariable = 1.55f;
		
		System.out.println("\nintVariable - " + intVariable);
		System.out.println("doubleVariable - " + doubleVariable);
		System.out.println("floatVariable - " + floatVariable + "\n");
		
		int size = intVariable;
		int array[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}
	
		

}
}
