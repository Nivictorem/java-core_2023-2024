package timus;

import java.util.Scanner;

public class task_1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        String[][] digits = new String[n][n];
        int r = 0;
        int startRow = 0;
        int startColumn = n-1;
        while (count <= n*n)
        {
            for(int i = 0; i <= r; i++)
            {
                int curRow = startRow +i;
                int curColumn = startColumn + i -r;
                if(curColumn >= n || curColumn < 0 || curRow < 0 || curRow >= n)
                {
                    continue;
                }
                digits[curRow][curColumn] = String.valueOf(count++);
            }
            r++;
        }
        PrintFunc(n, digits);
        in.close();
    }
    public static void  PrintFunc(int n, String[][] digits)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(digits[i][j] + (j==n-1?"":" "));
            }
            System.out.println();
        }
        System.out.println();
    }
}
