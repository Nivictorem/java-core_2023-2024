package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит два числа, а
//        программой вычисляется и отображается сумма и разность этих чисел.
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextFloat();
        var b = in.nextFloat();
        System.out.printf("%f + %f  = %f\n", a, b, a+b);
        System.out.printf("%f - %f  = %f", a, b, a-b);
        in.close();
    }
}
