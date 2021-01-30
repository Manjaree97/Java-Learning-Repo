package Inheritance;

class ParentClass {
	// Parent class constructor
	ParentClass() {
		System.out.println("Constructor of Parent");
	}
	ParentClass(int n){
		System.out.println(n);
	}
}

class JavaExample extends ParentClass {
	JavaExample() {
		//super(10);
		System.out.println("Constructor of Child");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		JavaExample obj =	new JavaExample();

	}

}
