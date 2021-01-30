package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import java.util.Comparator;

@FunctionalInterface
interface Square {
  int calculate(int x);
//  void display();
  boolean equals(Object var1);
  default void display(Square s) {
    System.out.println(s);
  }
  static void doNothing() {}
}


public class FunctionalInterfaceDemo {

  public static void main(String args[]) {

    // lambda expression to create the object
    new Thread(() ->
    {
      System.out.println("New thread created");
    }).start();

    int a = 5;

    // lambda expression to define the calculate method
    Square s = (int x)->x*x;

    // parameter passed and return type must be
    // same as defined in the prototype
    int ans = s.calculate(a);
    System.out.println(ans);
  }
}

class WithoutFuntionalInterfaceImpl {

  public static void main(String args[]) {
    // create anonymous inner class object
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("New thread created");
      }
    }).start();
  }
}

// A simple program to demonstrate the use
// of function interface
class FunctionInterfaceDemo {
  static String show(Integer message){
    return "Hello "+message;
  }
  public static void main(String[] args) {
    // Function interface referring to a method
    Function<Integer, String> fun = FunctionInterfaceDemo::show;
    // Calling Function interface method
    System.out.println(fun.apply(1));
  }
}
// A simple program to demonstrate the use
// of predicate interface
class PredicateDemo {

  public static void main(String args[]) {

    // create a list of strings
    List<String> names =
        Arrays.asList("Cerner", "Java Session", "Functional Interface", "Corporation");

    // declare the predicate type as string and use
    // lambda expression to create object
    Predicate<String> p = (s) -> s.startsWith("C");
    Predicate<String> q = (s) -> s.endsWith("r");

    // Iterate through the list
    for (String st : names) {
      // call the test method
      if (p.test(st)) {
        System.out.println(st);
      }
      if ((p.and(q)).test(st)) {
        System.out.println(st);
      }
    }
  }
}

// A simple program to demonstrate the use
// of supplier interface
class SupplierDemo {

  public static double squareLazy(Supplier<Double> lazyValue) {
    return Math.pow(lazyValue.get(), 2);
  }

  public static void main(String[] args) {
    Supplier<Double> lazyValue = () -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return 9d;
    };

    Double valueSquared = squareLazy(lazyValue);
    System.out.println(valueSquared);

//    int[] fibs = {0, 1};
//    Stream<Integer> fibonacci = Stream.generate(() -> {
//      int result = fibs[1];
//      int fib3 = fibs[0] + fibs[1];
//      fibs[0] = fibs[1];
//      fibs[1] = fib3;
//      return result;
//    });
//    fibonacci.forEach(s -> System.out.println(s));
  }
}

// A simple program to demonstrate the use
// of Consumer interface
//The lambda passed to the List.forEach method implements the Consumer functional interface
class ConsumerDemo {

    static void ShowDetails(String name, Integer age){
      System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Freddy", "Samuel");
    names.forEach(name -> System.out.println("Hello, " + name));

    // Referring method
    BiConsumer<String, Integer> biCon = ConsumerDemo::ShowDetails;
    biCon.accept("Rama", 20);
    biCon.accept("Shyam", 25);
    // Using lambda expression
    BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);
    biCon2.accept("Peter", 28);

  }
}