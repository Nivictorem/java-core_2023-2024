package lr4;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается и инициализируется
//        двумерный числовой массив. Затем из этого массива удаляется строка и
//        столбец (создается новый массив, в котором по сравнению с исходным
//        удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//        удаляемого столбца определяется с помощью генератора случайных чисел
public class Example6 {
    public static void main(String[] args) {
        var rand = new Random(10);
        var arrArrs = new int[5][3];
        System.out.println("Изначальный массив:");
        for (var i = 0; i < arrArrs.length; i++)
        {
            arrArrs[i] = rand.ints(arrArrs[0].length, 0, 10).toArray();
            System.out.println(Arrays.toString(arrArrs[i]));
        }
        var arrArrs2 = new int[4][2];
        int a = rand.nextInt(arrArrs.length), b = rand.nextInt(arrArrs[0].length);
        int k = 0, s;
        for (int i = 0; i < arrArrs.length; i++)
        {
            if(i == a) continue;
            s = 0;
            for (int j = 0; j < arrArrs[0].length; j++)
            {
                if(j == b)
                    continue;
                arrArrs2[k][s] = arrArrs[i][j];
                s++;
            }
            k++;
        }
        System.out.println("Конечный массив:");
        for (var c : arrArrs2)
        {
            System.out.println(Arrays.toString(c));
        }
    }
}
