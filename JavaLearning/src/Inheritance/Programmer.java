package Inheritance;

class Programmer1 extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		Programmer1 p = new Programmer1();
		System.out.println("Programmer salary is:" + p.getSalary());
		System.out.println("Bonus of Programmer is:" + p.bonus);
		p.designation();
	}
}
