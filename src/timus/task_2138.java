package timus;

import java.util.Scanner;

public class task_2138 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String isGood = in.nextLine();
        long number = in.nextLong();
        long N1 = 16777216;
        long N2 = 65536;
        long N3 = 256;
        long N4 = 1;
        long Num1 = 0;
        long Num2 = 0;
        long Num3 = 0;
        long Num4 = 0;
        Num1 = number/N1;
        Num2 = (number%N1)/N2;
        Num3 = ((number%N1)%N2)/N3;
        Num4 = ((number%N1)%N2)%N3;
        number = Num4*N1 + Num3*N2 + Num2*N3 + Num1*N4;
        //System.out.printf("%d %d %d %d\n", Num1, Num2, Num3, Num4);
        System.out.println(number);
        System.out.flush();
    }
}
