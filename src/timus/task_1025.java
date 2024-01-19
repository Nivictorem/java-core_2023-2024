package timus;

import java.util.Arrays;
import java.util.Scanner;

public class task_1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] groups = new int[count];
        for(int i = 0; i < count; i++)
        {
            groups[i] = in.nextInt();
        }
        groups = Arrays.stream(groups).sorted().toArray();
        int countH = 0;
        for (int i = 0; i <= groups.length/2; i++)
        {
            countH += groups[i]/2 + 1;
        }
        System.out.println(countH);
    }
}
