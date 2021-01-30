package NonAccessModifiers;

import static java.lang.Math.sqrt;
public class StaticDemo {
    private static int numInstances = 0;
    private static int staticVariable;
    private int normalVariable = 30;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    StaticDemo() {

        StaticDemo.addInstance();
        System.out.println("inside a constructor ");
    }
    {
        System.out.println("inside a normal block");
    }
    static {
        staticVariable = (int) sqrt(100);
        System.out.println("Static block initialized. StaticVariable = "+ staticVariable);
    }
    public static void main(String[] arguments) {
        System.out.println("Starting with " + StaticDemo.getCount() + " instances");
        for (int i = 0; i < 5; ++i) {
            new StaticDemo();
        }
        System.out.println("Created " + StaticDemo.getCount() + " instances");
        NestedClass.display();
        NestedClass ns = new NestedClass();
        ns.display2();
    }
    //nested class
    public static class NestedClass {

        // only static members
        // of Outer class are accessible in
        // this static nested class class
        public static void display()
        {
            System.out.println(
                    "Inside static nested class display. Number of Instances of outer class="
                            + numInstances);
        }
        public void display2()
        {
            System.out.println(
                    "Inside static nested class display2. Number of Instances of outer class="
                            + numInstances);
        }
    }
}

