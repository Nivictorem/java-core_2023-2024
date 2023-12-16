package lr6;
//Напишите программу со статическим методом, аргументом которому передается
//        целочисленный массив, а результатом возвращается среднее значение для элементов
//        массива (сумма значений элементов, деленная на количество элементов в массиве).

import java.util.Arrays;

public class Task8 {
    public static double GetAvarageNum(int[] int1)
    {
        return Arrays.stream(int1).sum() / (double)int1.length;
    }
}
