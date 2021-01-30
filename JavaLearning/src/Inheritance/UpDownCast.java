package Inheritance;

// Parent class
class Parent { 
	String name; 
	
	void method() 
	{ 
		System.out.println("Method from Parent"); 
	} 
} 

// Child class 
class Child extends Parent { 
	int id; 

	@Override
	void method() 
	{ 
		//super.method();
		System.out.println("Method from Child"); 
	} 
	
} 

public class UpDownCast { 

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Upcasting 
		Parent p = new Child(); 
		p.name = "GeeksforGeeks"; 
		//p.id = 1; 
		System.out.println(p.name); 
		p.method(); 

		// Trying to Downcasting Implicitly 
		//Child c = new Parent(); - > compile time error 

		// Downcasting Explicitly 
		//Child c = (Child) new Parent();
		
		Child c = (Child)p;
		c.id = 1; 
		c.name="tt";
		System.out.println(c.name); 
		System.out.println(c.id); 
		c.method(); 
	} 
} 

