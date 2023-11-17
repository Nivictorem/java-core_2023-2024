package lr3;

import java.sql.Array;
import java.util.Scanner;


//Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается
//        последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//        в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла
public class Example3 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var length = in.nextInt();
        in.close();
        Variant1(length);
        Variant2(length);
    }

    private static void Variant2(int length) {
        var arr =  new Integer[length];
        for (int i = 1; i <= length; i++)
        {
            if(i<=2)
            {
                arr[i-1] = 1;
            }
            else
                arr[i-1] = arr[i-2] + arr[i-3];
            System.out.print(arr[i-1]);
        }
        System.out.print("\n");
    }

    private static void Variant1(int length) {
        var i = 0;
        var arr =  new Integer[length];
        while (i < length)
        {
            if(i<2)
            {
                arr[i] = 1;
            }
            else
                arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i]);
            i++;
        }
    }
}
