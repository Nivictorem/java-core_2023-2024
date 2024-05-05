package timus;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int k  = in.nextInt();
        double timePerOne = (double) k / 2;
        int count = (int)Math.ceil(n / timePerOne);
        System.out.println(count == 1 ? 2 : count);
        in.close();
    }
}
