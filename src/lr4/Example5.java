package lr4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается двумерный целочисленный
//        массив. Он заполняется случайными числами. Затем в этом массиве строи и
//        столбцы меняются местами: первая строка становится первым столбцом,
//        вторая строка становиться вторым столбцом и так далее. Например, если
//        исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//        из 5 строк и 3 столбцов.
public class Example5 {
    public static void main(String[] args) {
        var rand = new Random(200);
        var arrArrs = new int[5][3];
        System.out.println("Изначальный массив:");
        for (var i = 0; i < arrArrs.length; i++)
        {
            arrArrs[i] = rand.ints(3, 0, 10).toArray();
            System.out.println(Arrays.toString(arrArrs[i]));
        }
        var arrArrs2 = new int[arrArrs[0].length][arrArrs.length];
        for (int i = 0; i < arrArrs.length; i++)
        {
            for (int j = 0; j < arrArrs[0].length; j++)
            {
                arrArrs2[j][i] = arrArrs[i][j];
            }
        }
        System.out.println("Конечный массив:");
        for (var a : arrArrs2)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
