/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge
{
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int[] array = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
            array[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++)
        {
            array[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < array.length; i++)
        {
            int number = array[i];
            int j;
            for (j = i - 1; j >= 0 && number < array[j]; j--)
            {
                array[j + 1] = array[j];
            }
            array[j + 1] = number;
        }
        return array;
    }
}

