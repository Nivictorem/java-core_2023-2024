package timus;

import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] digits = new String[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                digits[i][j] = String.valueOf(in.nextInt());
            }
        }
        PrintFunc(n, digits);
        in.close();
    }
    public static void  PrintFunc(int n, String[][] digits)
    {
        int count = 1;
        int r = 0;
        int startRow = 0;
        int startColumn = 0;
        while (count <= n*n)
        {
            for(int i = 0; i <= r; i++)
            {
                int curRow = startRow + r -i;
                int curColumn = startColumn + i;
                if(curColumn >= n || curColumn < 0 || curRow < 0 || curRow >= n)
                {
                    continue;
                }
                System.out.print(digits[curRow][curColumn] + (count==n*n?"":" "));
                count++;
            }
            r++;
        }
    }
}
