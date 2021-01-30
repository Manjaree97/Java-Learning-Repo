package Inheritance;

class Employee {
	 protected float salary = 40000;

	 public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	protected void designation() {
		System.out.println("SE");
	}
}
