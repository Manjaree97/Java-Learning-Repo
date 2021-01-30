package MethodOverloadingAndOverrriding.src.com.cerner.example.methodoverloading;

public class Adder {

  public static void main(String[] args) {
    System.out.println(Adder.add(2, 2));
    System.out.println(Adder.add(2, 2, 2));
    System.out.println(Adder.add(2.5, 2.5));
    System.out.println(Adder.add(2, 2.5));
    System.out.println(Adder.add(2.5, 2));
  }

  /* Basic Examples of Method Overloading */

  static int add(int num1, int num2) {
    return num1 + num2;
  }

  static int add(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  // changing parameter data types
  static double add(double num1, double num2) {
    return num1 + num2;
  }

  // changing sequence
  static double add(int num1, double num2) {
    return num1 + num2;
  }

  // other way works too
  static double add(double num1, int num2) {
    return num1 + num2;
  }

  /*
    Can we overload two methods by only changing return type?
  */

//  static double add(int num1, int num2) {
//    return num1 + num2;
//  }

  /*
    Overloading the Java main method is allowed,
    but JVM only calls the String[] args variant.
  */

  public static void main(String arg) {}
  public static void main() {}
}
