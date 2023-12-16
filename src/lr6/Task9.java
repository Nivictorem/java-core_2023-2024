package lr6;
//Напишите программу со статическим методом, аргументом которому передается
//        одномерный символьный массив. В результате вызова метода элементы массива попарно
//        меняются местами: первый — с последним, второй — с предпоследним и так далее.
public class Task9 {
    public static void RecombinateNums(int[] int1)
    {
        int a;
        for(int i = 0; i < int1.length/2; i++)
        {
            a = int1[i];
            int1[i] = int1[int1.length - i - 1];
            int1[int1.length - i - 1] = a;
        }
    }
}
