package OrderOfExecution;

public class OrderDemo {
}
// Java program to illustrate
// Instance Initialization Block
// with super()

// Parent Class
class B
{
    B()
    {
        System.out.println("B-Constructor Called");
    }

    {
        System.out.println("B-IIB block");
    }
    // Instance Initialization Block - 2
    {
        System.out.println("B- IIB2 block");
    }
    static{
        System.out.println("B-static block");
    }
    static{
        System.out.println("B-static block2");
    }
}

// Child class
class A extends B
{
    A()
    {
        super();
        System.out.println("A-Constructor Called");
    }
    {
        System.out.println("A-IIB block");
    }

    // Instance Initialization Block - 2
    {
        System.out.println("A- IIB2 block");
    }
    static{
        System.out.println("A-static block");
    }
    static{
        System.out.println("A-static block2");
    }
    // main function
    public static void main(String[] args)
    {
        System.out.println("A-Executing main method");
        A a1 = new A();
        A a2 = new A();
    }
}