package lr1;

import java.util.Scanner;

//Напишите программу для вычисления суммы двух чисел. Оба числа
//        вводятся пользователем. Для вычисления суммы используйте оператор +
public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var a = in.nextFloat();
        var b = in.nextFloat();
        System.out.printf("%f + %f = %f", a, b, a+b);
        in.close();
    }
}
