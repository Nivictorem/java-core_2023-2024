package lr11;

import java.util.Arrays;

//2.	Напишите функцию, которая принимает на вход два массива целых чисел и возвращает новый массив, содержащий только те элементы, которые есть в обоих массивах.
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] arr1 = new int[20];
        for (int i =0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100);
            arr1[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(GetInt(arr, arr1)));
    }
    private static int[] GetInt(int[] arr, int[] arr1) {
        return Arrays.stream(arr).filter(x -> Arrays.stream(arr1).anyMatch(y->y==x)).toArray();
    }
}
