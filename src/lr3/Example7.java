package lr3;

import java.util.Arrays;
import java.util.Scanner;

//Напишите программу, в которой создается одномерный
//        символьный массив из 10 элементов. Массив заполняется буквами «через
//        одну», начиная с буквы ' а ':
//        то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
//        ' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
//        порядке. Размер массива задается переменной.
public class Example7 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var length = 10;
        int j = 0;
        var arr = new char[length];
        for(int i = 0; i<length; i++)
        {
            arr[i] = ((char) (97+j));
            j += 2;
        }
        System.out.println(Arrays.toString(arr));
        var arr1 = new char[length];
        for(int i = length-1; i>=0; i--)
        {
            arr1[length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
