package BasicDataStructures.string;

public class StringManipulation
{
  public static void main(String[] args)
  {
    StringManipulation string = new StringManipulation();
    string.stringManipulation();
    string.splitString();
  }

  /**
   * returns a new string as Java strings are immutable,
   * once string object is created its data or state
   * can't be changed but a new string object is created
   */
  public void stringManipulation() {
    String string = "Hello";

//        System.out.println(string.substring(1, 3));
//
//        System.out.println("lowercase: " + string.toLowerCase());
//        System.out.println("uppercase: " + string.toUpperCase());
//
//        System.out.println(string.replace('o', '0'));
//        System.out.println(string.replace("ll", "LL"));
//
//        System.out.println(string.concat("World"));
//        System.out.println(string + " " + "World");
//
//        System.out.println(string);
  }

  public void splitString() {
    String[] strings = "some,random,comma,separated,words".split(",");

//    for(String string : strings)
//      System.out.println(string);
  }
}
