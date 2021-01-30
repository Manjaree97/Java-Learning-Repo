package MethodOverridingWithExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import static java.lang.Math.pow;

public class MethodOverridingWithExceptionHandling {
    public static void main(String[] args) {
        try {
            Shape shape;
            shape = new Triangle();
            shape.area(5);
            shape.area(4,5);
            shape.area(4,5,7);
            shape.getInput();
        }
        catch (Exception e) {}

    }
}

//If the method in super class has not declared any exception
class Shape {
    public void area(int dimension1){
        System.out.println("Calculate Shape area (1 Dimension)- Parent Class");
    }
    public void area(int dimension1, int dimension2) throws ArithmeticException{
        System.out.println("Calculate Shape area (2 Dimension)- Parent Class");
    }
    public void area(int dimension1, int dimension2, int dimesnsion3) throws ParseException{
        System.out.println("Calculate Shape area (3 Dimension)- Parent Class");
    }
    public void getInput () throws IOException {};
}
class Triangle extends Shape {
    // Overridden method
    public void area(int side) throws IllegalArgumentException  /*ParseException*/ {
        double area = pow(3,0.5)*side*side;
        System.out.println("Equilateral Triangle area " + area);
    }
    public void area(int base, int height) throws IllegalArgumentException,  /*ParseException*/  ArithmeticException{
        double area = 0.5*base*height;
        System.out.println("Triangle area " + area);
    }

    public void area(int side1, int side2, int side3) throws /*Exception,*/ ParseException , ArithmeticException{
        double a = (side1+side2+side3)/2.0d;
        double area = Math.sqrt(a* (a - side1) * (a - side2) * (a - side3));
        System.out.println("Triangle area " + area);
    }

    public void getInput () throws FileNotFoundException, /*Exception*/ /*ParseException,*/  ArithmeticException{};
}