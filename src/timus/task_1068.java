package timus;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        for(int i = 1; i != a; )
        {
            sum+=i;
            i += i<a?1:-1;
        }
        System.out.println(sum+a);
    }
}
