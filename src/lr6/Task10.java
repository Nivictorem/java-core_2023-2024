package lr6;

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу
public class Task10 {
    public static int[] ReturnMinMaxValue(int ... int1)
    {
        return new int[]{Arrays.stream(int1).max().getAsInt(),
                Arrays.stream(int1).min().getAsInt()};
    }
}
