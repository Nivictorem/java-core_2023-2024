package lr6;

import java.util.ArrayList;
import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передастся
//        символьный массив, а результатом возвращается ссылка на целочисленным массив,
//        состоящий из кодов символов из массива- аргумента.
public class Task7 {
    public static int[] CastToCode(char[] ch1)
    {
        int[] t1 = new int[ch1.length];
        for (int i  = 0; i < ch1.length; i++)
        {
            t1[i] = (int)ch1[i];
        }
        return t1;
    }
}
