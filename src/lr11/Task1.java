package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i =0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10);
        }
        int[] arr1 = GetInt(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] GetInt(int[] arr) {
         return Arrays.stream(arr).filter(x -> x%2 == 0).toArray();
    }

}
