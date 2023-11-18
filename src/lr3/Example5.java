package lr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается
//        2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.
public class Example5 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var length = in.nextInt();
        var arrInt = new ArrayList<Integer>();
        for (int i = 0; arrInt.size() < length; i++)
        {
            if(i%5 == 2 || i%3 == 1)
                arrInt.add(i);
        }
        Variant1(arrInt);
        Variant2(arrInt);
    }

    private static void Variant2(ArrayList<Integer> arrInt) {
        System.out.println(arrInt.toString());
        var sum = 0;
        for (int i : arrInt )
        {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void Variant1(ArrayList<Integer> arrInt) {
        System.out.println(arrInt.toString());
        int i = 0;
        var sum = 0;
        while (i<arrInt.size())
        {
            sum += arrInt.get(i++);
        }
        System.out.println(sum);

    }
}
