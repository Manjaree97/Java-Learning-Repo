package Operators;

public class Operators {

	public static void main(String[] args) {
		arithmeticOp();
		prepostOp();
		compoundAssignmentOp();
		relationalOp();
		logicalOp();
		ternaryOp();
		bitwiseOp();
		miscexamples();
	}

	public static void bitwiseOp() {
		int a = 3;
		int b = 2;
		System.out.println(a & b); // bitwise AND
		System.out.println(a | b); // bitwise OR
		System.out.println(a ^ b); // bitwise XOR
		System.out.println(~a); // bitwise compliment
		System.out.println(a << b); // leftshift operator
		System.out.println(a >> b); // rightshift operator

		int x = -5 >>> 1; // unsigned rightshift
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x)); // binary of x
	}

	public static void prepostOp() {
		int m = 10;
		System.out.println("prefix " + ++m); // prefix
		int n = 10;
		System.out.println("postfix " + n++ + " " + n++);// postfix
		System.out.println(n++);
		System.out.println(++n);
		System.out.println(n);
		System.out.println(--n);
		System.out.println(n--);
		System.out.println(n);
	}

	public static void arithmeticOp() {
		float a = 13;
		int b = 5;
		float op = a / b;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a % b);
		System.out.println(a / b);
		System.out.println(op);
	}

	public static void compoundAssignmentOp() {
		int n = 100;
		int m = 1;
		n += m;
		System.out.println(n);
		int p = 10;
		int q = 6;
		int r = 2;
		p *= q / r; // the result of right is assigned to left
		System.out.println(p);
	}

	public static void relationalOp() {
		Integer n = new Integer(10);
		Integer k = new Integer(10);
		// int n = 11;
		// int k = 11;
		int a[] = { 1, 2 };
		int b[] = { 1, 2 };
		System.out.println(1 > 2);
		System.out.println(1 > 1);
		System.out.println(1 >= 1);
		System.out.println(!true);
		System.out.println(n == k);
		System.out.print(n.equals(k));
	}

	public static void logicalOp() {
		System.out.println(!(2 > 1) || 3 > 2 && 4 > 3);
		System.out.println(2 > 1 && 1 > 3 || 1 > 3);
	}

	public static void ternaryOp() {
		int m = 1 > 0 ? 3 : 4;
		System.out.println(m);
	}

	public static void miscexamples() {
		System.out.println("1 + 2 = " + 1 + 2);
		System.out.println("1 + 2 = " + (1 + 2));
		System.out.println(8 * 4 / 2 + 3);
		int x, y, z;
		x = 0;
		y = 1;
		x = y = z = 8;
		System.out.println(x);
	}

}
