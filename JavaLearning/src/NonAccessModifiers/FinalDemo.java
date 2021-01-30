package NonAccessModifiers;

public class FinalDemo {
    // a final variable
    // direct initialize
    final int THRESHOLD = 5;

    // a blank final variable
    final int CAPACITY;

    // another blank final variable
    final int  MINIMUM;

    // a final static variable PI
    // direct initialize
    static final double PI = 3.141592653589793;

    // a  blank final static  variable
    static final double EULERCONSTANT;

    // instance initializer block for
    // initializing CAPACITY
    {
        CAPACITY = 25;
    }

    // static initializer block for
    // initializing EULERCONSTANT
    static{
        EULERCONSTANT = 2.3;
    }
//    {
//        MINIMUM = -3;
//    }
    // constructor for initializing MINIMUM
    // Note that if there are more than one
    // constructor, you must initialize MINIMUM
    // in them also
    public FinalDemo()
    {
        MINIMUM = -1;
    }
    public FinalDemo(int minimum)
    {
        MINIMUM = minimum;
    }

    public static void main(String[] args)
    {
        // local final variable
        final int i;
        i = 20;
        //i=10; //error: Variable 'i' might already have been assigned to
        // a final reference variable sb
        final StringBuilder sb = new StringBuilder("Cerner ");

        System.out.println(sb);

        // changing internal state of object
        // reference by final reference variable sb
        sb.append("Corporation");

        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder("Cerner Corporation");
        //sb = sb2; //Compilation error: Cannot assign a avalue to final variabple 'sb'
    }
}

//Final class demo
final class A
{
    // methods and fields
}
 //The following class is illegal.
//class B extends A
//{
//    // COMPILE-ERROR! Can't subclass A
//}


//Final Method demo
class X
{
    final void m1()
    {
        System.out.println("This is a final method.");
    }
}

class B extends X
{
//    void m1()
//    {
//        // COMPILE-ERROR! Can't override.
//        System.out.println("Illegal!");
//    }
}

//final method can be overloaded and that overloaded method can be overridden in the sub class.
class SuperClass
{
    final void methodOne()
    {
        //final method
    }

    void methodOne(int i)
    {
        //final method can be overloaded
    }
}

class SubClass extends SuperClass
{
    @Override
    void methodOne(int i)
    {
        //Overloaded method can be overridden
    }
}