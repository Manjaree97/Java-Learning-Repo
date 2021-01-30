package BasicDataStructures.array;

public class Array
{
  public static void main(String[] args) {
    Array array = new Array();

//    array.basicArray();
    array.initArrayDuringDeclaration();
  }

  public void basicArray()
  {
    int[] age = new int[5];
    age[3] = 99;

    for (int i = 0; i < 5; ++i)
    {
      System.out.println(age[i]);
    }
  }

  public void initArrayDuringDeclaration() {
    // initializing during declaration
    int[] age = {1, 2, 3, 4, 5};

    for (int i = 0; i < 5; ++i)
    {
      System.out.println(age[i]);
    }
  }
}
