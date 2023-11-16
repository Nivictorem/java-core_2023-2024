package lr2;
//Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: число делится на 4, и при
//        этом оно не меньше 10.


import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextInt();
        System.out.printf("Число %d %s условиям", a,
                a % 4 == 0 && a >= 10 ? "удовлетворяет" : "не удовлетворяет");
        in.close();
    }
}
