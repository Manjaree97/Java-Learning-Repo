package Inheritance;

class Employee1 {
	protected void displayInfo() {
		System.out.println("Employee");
	}
}

class Programmer extends Employee {
	public void displayInfo() {
		//super.displayInfo();
		System.out.println("Programmer");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		Programmer d1 = new Programmer();
		d1.displayInfo();
	}

}
