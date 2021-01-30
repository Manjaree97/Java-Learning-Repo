package BasicDataStructures.string;

public class StringComparison
{
  public static void main(String[] args)
  {
    StringComparison string = new StringComparison();

    string.stringCompare();
    string.lexicographicalCompare();
  }

  public void stringCompare() {
    String string1 = "Solar";
    String string2 = "System";

//        System.out.println(string1.equals(string2));
//        System.out.println(string1 == string2);

    // caution: sometimes using .equals can be risky
    // solution: use guarded coding techniques
    riskyStringCompare(null);
  }

  public void riskyStringCompare(String str) {
    String string = "Uranus";

//        System.out.println(str.equals(string));
//        System.out.println(str == string);
  }

  /**
   * the value 0 if the argument string is equal to this string;
   * a value less than 0 if this string is lexicographically less than the string argument;
   * a value greater than 0 if this string is lexicographically greater than the string argument.
   */
  public void lexicographicalCompare() {
    final String string1 = "Solar System";

    int result3 = "Mars".compareTo("Earth");
    int result4 = "Mars".compareTo("Mars");
    int result5 = string1.compareTo(string1);

//        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
  }
}
