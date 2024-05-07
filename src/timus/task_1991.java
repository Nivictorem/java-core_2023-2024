package timus;

import java.util.Scanner;

public class task_1991 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int sumB = 0;
        int sumD = 0;
        for (String str : in.nextLine().split(" "))
        {
            int delta = k - Integer.parseInt(str);
            if(delta > 0)
            {
                sumD += delta;
            }
            else
            {
                sumB -= delta;
            }
        }
        System.out.printf("%d %d", sumB, sumD);
    }
}
