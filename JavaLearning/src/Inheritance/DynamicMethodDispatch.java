package Inheritance;

class Bike {
	private class ex1 extends Bike{
		public void run1() {
			run();
		}
	}
	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("running safely with 60km");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Bike b = new Splendor();//upcasting  
	    b.run(); 

	}

}
