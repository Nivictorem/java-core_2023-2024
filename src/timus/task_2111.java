package timus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task_2111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCities = in.nextInt();
        long[] arr = new long[numCities];
        long sum = 0;
        for (int i = 0; i < numCities; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long weight = Arrays.stream(arr).sum();
        for (int i = numCities-1; i > -1; i--)
        {
            sum += weight * arr[i];
            weight -= arr[i];
            sum += weight * arr[i];
        }
        System.out.println(sum);
        System.out.flush();

    }
}
