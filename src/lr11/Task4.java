package lr11;

import java.util.Arrays;

//4.	Напишите функцию, которая принимает на вход список чисел и возвращает новый список, содержащий квадраты этих чисел.
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i =0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10);
        }
        int[] arr1 = GetInt(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    private static int[] GetInt(int[] arr) {
        return Arrays.stream(arr).map(x -> x*x).toArray();
    }
}
