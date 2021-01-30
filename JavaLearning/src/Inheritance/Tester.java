package Inheritance;

public class Tester extends Programmer1 {
	int extraBonus = 2000;

	public static void main(String[] args) {
		Tester t = new Tester();
		System.out.println("Programmer salary is:" + t.salary);
		System.out.println("Bonus of Programmer is:" + t.bonus);
		t.designation();
		System.out.println("Extra Bonus" +t.extraBonus);
	}

}