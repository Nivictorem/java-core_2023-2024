package lr4;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее
public class Example7 {
    public static void main(String[] args) {
        var rand = new Random(10);
        var arrArrs = new int[5][5];
        PrintArr(arrArrs);
        int minHeight = 0, maxHeight = arrArrs.length;
        int minWidth = 0, maxWidth = arrArrs[0].length;
        int i = 0, j = 0;
        while (true)
        {
            i = minHeight;
            j = minWidth;
            while (j < maxWidth)
            {
                arrArrs[i][j] = rand.nextInt(10);
                j++;
                PrintArr(arrArrs);
            }
            i = ++minHeight;
            j = --maxWidth;
            if(maxHeight == minHeight)
                break;
            while (i  < maxHeight)
            {
                arrArrs[i][j] = rand.nextInt(10);
                i++;
                PrintArr(arrArrs);
            }
            i = --maxHeight;
            j = maxWidth - 1;
            if(maxWidth == minWidth)
                break;
            while (j >= minWidth)
            {
                arrArrs[i][j] = rand.nextInt(10);
                j--;
                PrintArr(arrArrs);
            }
            j = minWidth++;
            i = maxHeight - 1;
            while (i >=  minHeight)
            {
                arrArrs[i][j] = rand.nextInt(10);
                i--;
                PrintArr(arrArrs);
            }
        }
    }
    public static void PrintArr(int[][] arrArrs)
    {
        for (var i = 0; i < arrArrs.length; i++)
        {
            System.out.println(Arrays.toString(arrArrs[i]));
        }
        System.out.println();
    }
}
