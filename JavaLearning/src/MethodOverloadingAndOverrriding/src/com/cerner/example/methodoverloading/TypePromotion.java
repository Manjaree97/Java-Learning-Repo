package MethodOverloadingAndOverrriding.src.com.cerner.example.methodoverloading;

public class TypePromotion
{
  public static void main(String[] args)
  {
    // But Type Promotion has lower priority
    System.out.println(TypePromotion.add(2, 2));
  }

  /*
    Type Promotion and Method Overloading
    Smaller box fits in larger box, not vice versa
  */
  static double add(int num1, double num2) {
    return num1 + num2;
  }

  /*
    Type Promotion has lower priority,
    if a matching method is found,
    type promo will not occur
  */

//  static int add(int num1, int num2) {
//    return num1 + num2;
//  }

  /*
    After promoting type,
    if two matching methods are found,
    ambiguity will occur.
  */

//  static double add(double num1, int num2) {
//    return num1 + num2;
//  }
}
