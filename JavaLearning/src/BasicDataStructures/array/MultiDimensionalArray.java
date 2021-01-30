package BasicDataStructures.array;

public class MultiDimensionalArray
{
  public static void main(String[] args)
  {
    MultiDimensionalArray array = new MultiDimensionalArray();

//    array.twoDimensionalArray();
    array.threeDimensionalArray();
  }

  public void twoDimensionalArray()
  {
    // nested arrays can have different lengths
    int[][] array = {{1, 2, 3}, {4, 5, 6, 9}, {7},};

    for (final int[] numbers : array)
    {
      for (final int number : numbers)
      {
        System.out.println(number);
      }
    }

    //    for (int i = 0; i < array.length; ++i)
    //    {
    //      for (int j = 0; j < array[i].length; ++j)
    //      {
    //        System.out.println(array[i][j]);
    //      }
    //    }
  }

  public void threeDimensionalArray()
  {
    // create a 3d array
    int[][][] array3D =
            {
                    {{1, -2, 3}, {2, 3, 4}},
                    {{-4, -5, 6, 9}, {1}, {2, 3}}
            };

    for (int[][] array2D : array3D)
    {
      for (int[] array1D : array2D)
      {
        for (int item : array1D)
        {
          System.out.println(item);
        }
      }
    }
  }

}
