package conditionalStats;

public class IfConditionDemo {

	public static void main(String[] args) {
		int num = 10;
		int age = 25;
		int weight = 48;

		// If-else
		if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		// if-else-if ladder
		if (num == 0) {
			System.out.println("do nothing");
		} else if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		// Nested-if
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}
