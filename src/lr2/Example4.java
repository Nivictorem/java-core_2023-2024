package lr2;
//Напишите программу, которая проверяет, попадает ли введение
//        пользователем число в диапазон от 5 до 10 включительно.

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextInt();
        System.out.printf("Число %d %s условиям", a,
                a >= 5 && a <= 10 ? "удовлетворяет" : "не удовлетворяет");
        in.close();
    }
}
