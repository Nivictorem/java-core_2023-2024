package timus;

import java.util.Arrays;
import java.util.Scanner;

public class task_1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] section = new int[n];
        int[] sectionMed = new int[n-2];
        for(int i =0; i < n; i++)
        {
            section[i] = in.nextInt();
        }
        for(int i = 1; i < n-1; i++)
        {
            sectionMed[i-1] = section[i-1] + section[i] + section[i+1];
        }
        int max = Arrays.stream(sectionMed).max().getAsInt();
        for(int i = 0; i < n-2; i++)
        {
            if(max == sectionMed[i])
                System.out.println(max + " " + (i+2));
        }
    }
}
