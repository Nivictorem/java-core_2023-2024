package timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] digits = new long[n];
        for (int i = 0; i < n; i++)
        {
            digits[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            long D = 1 + 8 * (digits[i] - 1);
            long sqrD = (long)Math.pow(D, 0.5);
            System.out.print(D!=(sqrD*sqrD)? 0 : 1);
            System.out.print(i==n-1? "" : " ");
        }
    }
}
