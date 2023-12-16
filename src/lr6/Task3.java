package lr6;

import java.sql.Array;
import java.util.Arrays;

//Напишите программу с классом, в котором есть статические методы, которым
//        можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив). Методы, на основании переданных аргументов или массива,
//        позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//        значение из набора чисел.
public class Task3 {
    public static void GetMinMAxMiddleNums(int ... nums)
    {
        System.out.println(Arrays.stream(nums).max().getAsInt());
        System.out.println(Arrays.stream(nums).min().getAsInt());
        System.out.println(Arrays.stream(nums).sum() / (double)nums.length);
    }

}
