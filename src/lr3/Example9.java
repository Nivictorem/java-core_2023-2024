package lr3;

import java.util.*;

//Напишите программу, в которой создается массив и заполняется
//        случайными числами. Массив отображается в консольном окне. В этом
//        массиве необходимо определить элемент с минимальным значением. В
//        частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов
public class Example9 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var rand = new Random(200);
        System.out.println("Введите длину массива");
        var len = in.nextInt();
        var arr = rand.ints(len, 0, 10).toArray();
        var arr1 = arr.clone();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.printf("Минимальный элемент массива %d находится по индексом",
                arr1[0]);
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == arr1[0])
                System.out.print(" " + Integer.toString(i));
        }
    }
}
