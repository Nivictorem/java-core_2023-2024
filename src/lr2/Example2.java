package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: при делении на 5 в остатке
//        получается 2, а при делении на 7 в остатке получается 1.
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextInt();
        System.out.printf("Число %d %s условиям", a,
                a%5 == 2 && a%7 == 1 ? "удовлетворяет" : "не удовлетворяет");
        in.close();
    }
}
