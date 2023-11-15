package lr1;
//Напишите программу, в которой пользователь вводит число, а программой
//        отображается последовательность из четырех чисел: число, на единицу
//        меньше введённого, введенное число и число, на единицу больше введенного.
//        Четвертое число должно быть квадратом суммы первых трех чисел.

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var a = in.nextFloat();
        System.out.printf("%f %f %f %f", a-1, a, a+1, 3*3*a*a);
        in.close();
    }
}
