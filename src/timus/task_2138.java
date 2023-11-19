package timus;

import java.util.Scanner;

public class task_2138 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //long number = in.nextLong();
        long number = 1000000;
        long N1 = 167772116;
        long N2 = 65536;
        long N3 = 256;
        long N4 = 0;
        long Num1 = number/N1;
        long Num2 = (number%N1)/N2;
        long Num3 = ((number%N1)%N2)/N3;
        long Num4 = ((number%N1)%N2)%N3;
        System.out.printf("%d%d%d%d\n", Num1, Num2, Num3, Num4);
        System.out.printf("%d", Num4*N1 + Num3*N2 + Num2*N3 + Num1*N4);
        System.out.flush();
    }
}
