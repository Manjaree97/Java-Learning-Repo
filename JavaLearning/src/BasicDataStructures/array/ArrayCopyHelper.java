package BasicDataStructures.array;

import java.util.Arrays;

public class ArrayCopyHelper
{
  public static void main(String[] args)
  {
    ArrayCopyHelper helper = new ArrayCopyHelper();

//    helper.copyArray();
//        helper.copyArrayUsingLoop();
//        helper.copyArrayMethod();
    helper.copyOfRangeMethod();
  }

  public void copyArray()
  {
    int[] original = {1, 2, 3, 4};
    int[] fakeCopy = original;

    original[2] = 45;

    System.out.println(Arrays.toString(fakeCopy));
  }

  public void copyArrayUsingLoop()
  {
    int[] source = {1, 2, 3, 4, 5, 6};
    int[] destination = new int[6];


    // deep copy
    for (int i = 0; i < source.length; ++i)
    {
      destination[i] = source[i];
    }

    source[2] = 99;

    // converting array to string
    System.out.println(Arrays.toString(destination));
  }

  public void copyArrayMethod()
  {
    int[] source = {1, 2, 3, 4, 5, 6};
    int[] destination = new int[6];

    // deep copy
    System.arraycopy(source, 1, destination, 0, 4);

    // src - source array you want to copy
    // srcPos - starting position (index) in the source array
    // dest - destination array where elements will be copied from the source
    // destPos - starting position (index) in the destination array
    // length - number of elements to copy

    // converting array to string
    System.out.println(Arrays.toString(destination));
  }

  public void copyOfRangeMethod()
  {
    int[] source = {2, 3, 12, 4, 12, -2};

    // copying entire source array to destination
    int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
    System.out.println("destination1 = " + Arrays.toString(destination1));

    // copying from index 2 to 5 (5 is not included)
    int[] destination2 = Arrays.copyOfRange(source, 2, 5);
    System.out.println("destination2 = " + Arrays.toString(destination2));
  }
}
