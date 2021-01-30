package conditionalStats;

public class TernaryOpExample {
	public static void main(String[] args) {

	/* Ternary Operator example */
		int n1 = 5, n2 = 10, max;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		max = (n1 > n2) ? n1 : n2;

		System.out.println("Maximum is = " + max);

	/*Ternary operator data type example*/
		
		Object obj1;
		
		obj1 = true ? new Integer(10) : new Double(15.5);
		System.out.println(obj1); //check the output and type returned
	}
}
