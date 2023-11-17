package lr3;
//Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var arr = new int[2];
        for (int i = 0; i < 2; i++)
        {
            arr[i] =  in.nextInt();
        }
        Arrays.sort(arr);
        Output(arr, false);
        Output(arr, true);
    }

    private static void Output(int[] arr, boolean isRevers) {
        var i = 0;
        var arrRevers = new int[2];
        if(isRevers)
        {
            while(i<2)
            {
                arrRevers[i] = arr[arr.length-1-i];
                i++;
            }

        }
        else
            arrRevers = arr;
        System.out.print(Arrays.toString(arrRevers));
    }
}
