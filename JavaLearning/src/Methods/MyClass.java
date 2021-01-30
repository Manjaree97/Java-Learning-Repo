package Methods;

import NonAccessModifiers.AbstractDemo;

public class MyClass extends AbstractDemo {
    void display()
    {
        System.out.println("This is Abstract method!!!");
    }

    public static void main(String args[])
    {
        AbstractDemo obj = new MyClass();  //creating object of abstract class
        ((MyClass) obj).display();  //invoking abstract method
    }
}
