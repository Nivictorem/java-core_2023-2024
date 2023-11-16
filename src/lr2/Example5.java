package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, сколько тысяч во введенном
//        пользователем числе (определяется четвертая цифра справа в десятичном
//        представлении числа).
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextInt();
        System.out.printf("Число %d имеет  %d тысяч", a, a/1000);
        in.close();
    }
}
