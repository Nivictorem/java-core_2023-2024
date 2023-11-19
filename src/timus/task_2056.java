package timus;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class task_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        float median = (float)sum / arr.length;
        Arrays.sort(arr);
        if(arr[0]==3)
        {
            System.out.println("None");
        } else if (median == 5)
        {
            System.out.println("Named");
        } else if (median >= 4.5)
        {
            System.out.println("High");
        }
        else
        {
            System.out.println("Common");
        }
        System.out.flush();
    }
}
