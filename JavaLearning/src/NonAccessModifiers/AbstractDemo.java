package NonAccessModifiers;

import java.util.ArrayList;

public class AbstractDemo {
    public static void main(String args[]) {
        //ArrayList<Employee> employees;
       // Employee employee = new Employee();

        Employee employee = new Contractor();
        employee.fixedRate = 0;
        employee.perHour = 100;
        employee.totalHours = 250;
        System.out.println("Salary of employee= "+employee.salary());
    }
}

abstract class Employee {
    int totalHours; // In a month
    int perHour;    // Payment per hour
    int fixedRate;  // Fixed monthly rate
    abstract int salary();
    public void displayTotalHours(){
        System.out.println("Employee details:\nTotal work hours= "+totalHours);
    }
}

class Contractor extends Employee {
    // Must override salary if we wish to create an object of this class
    int salary() {
        return totalHours*perHour;
    }
    class FullTimeEmployee extends Employee {
      int salary() {
            return fixedRate;
        }
    }
}
class Intern extends Employee {
    int salary() {
        return 0;
    }
}