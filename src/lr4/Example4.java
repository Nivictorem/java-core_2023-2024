package lr4;
//Напишите программу, в которой создается двумерный массив, который
//        выводит прямоугольный треугольник;

public class Example4 {
    public static void main(String[] args) {
        var arrStr = new String[10];
        for (int i = 1; i < 11; i++)
        {
            arrStr[i-1] =  "2".repeat(i);
            System.out.println(arrStr[i-1]);
        }
    }
}
