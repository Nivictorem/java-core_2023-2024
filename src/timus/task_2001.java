package timus;

import java.util.Scanner;

public class task_2001
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int[][] mass = new int[3][2];
            for(int i = 0; i <  3; i++)
            {
                for(int j = 0; j <  2; j++)
                {
                    mass[i][j] = in.nextInt();
                }
            }
            System.out.printf("%d %d",mass[0][0] - mass[2][0], mass[0][1] - mass[1][1]);
            in.close();
        }
}

