package timus;

import java.util.Scanner;

public class task_1880 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = 1;
        int[][] counts = new int[test][];
        for(int i = 0; i < test; i++)
        {
            int n = in.nextInt();
            counts[i] = new int[n];
            for(int j = 0; j < n; j++)
            {
                counts[i][j] = in.nextInt();
            }
        }
        FindDigit(7, counts[test-1]);

    }
    public static boolean FindDigit(int digit, int[] seq)
    {
        int left = 0;
        int right = seq.length;
        while(true)
        {
            int pos = (left + right) / 2;
            if(digit > seq[pos])
            {
                left = pos;
            }
            else if (digit < seq[pos])
            {
                right = pos;
            }
            else
            {
                return true;
            }
        }
    }
}
