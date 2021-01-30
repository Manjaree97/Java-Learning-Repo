package BasicDataStructures.string;

import java.util.Arrays;

public class StringCreation
{
  public static void main(String[] args) {
    StringCreation string = new StringCreation();

    string.stringCreation();
    string.escaping();
    string.stringLength();
    string.getCharFromString();
    string.convertStringToBytes();
    string.stringValueOf();
  }

  public void stringCreation() {
    // new string added to the pool
    String company1 = "Cerner Corporation";
    // company2 points to the same string in the pool
    String company2 = "Cerner Corporation";

//    System.out.println(company1 == company2);

    // new string objects are created every time
    String company3 = new String("Cerner Corporation");
    String company4 = new String("Cerner Corporation");

//    System.out.println(company3 == company4);

    // can also create string from char array
    // there are tons of other means of creating string
    // using String constructor, refer Java docs.
    char[] mars = {'M', 'a', 'r', 's'};
//    System.out.println(new String(mars));
  }

  public void escaping() {
    String example = "This is the 'String' class.";
    String example2 = "This is the \"String\" class.";
    String example3 = "This is the backslash character: \\";

//        System.out.println(example);
//        System.out.println(example2);
//        System.out.println(example3);
  }

  public void stringLength() {
    String planet = "Earth";
//    System.out.println("The length of the string: " + planet.length());
  }

  public void getCharFromString() {
//    System.out.println("saturn".charAt(0));
//    System.out.println("saturn".charAt(2));
  }

  public void convertStringToBytes() {
    byte[] bytes = "string".getBytes();

//    for(byte b : bytes)
//      System.out.println(b);
  }

  public void stringValueOf() {
    double number = 6.99;
//    System.out.println(String.valueOf(number) instanceof String);
  }
}
