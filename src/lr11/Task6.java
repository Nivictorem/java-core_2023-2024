package lr11;

import java.util.Arrays;

//6.	Напишите функцию, которая принимает на вход список целых чисел и
// возвращает новый список, содержащий только те числа, которые делятся на заданное число без остатка.
public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i =0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        int[] arr1 = GetInt(arr, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] GetInt(int[] arr, int num) {
        return Arrays.stream(arr).filter(x -> x%num == 0).toArray();
    }

}
