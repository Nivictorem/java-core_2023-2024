package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается целочисленный
//        массив, заполняется случайными числами и после этого значения элементов в
//        массиве сортируются в порядке убывания значений.
public class Example10 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var rand = new Random(200);
        System.out.println("Введите длину массива");
        var len = in.nextInt();
        var arr = rand.ints(len, 0, 10).toArray();
        var arr1 = arr.clone();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = arr1[len - 1 -i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
