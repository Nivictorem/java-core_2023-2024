package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();;
        System.out.printf("%d %d", a+b-1-a, a+b-1-b);
    }
}
