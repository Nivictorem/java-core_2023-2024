package lr1;

import java.util.Calendar;
import java.util.Scanner;

//Напишите программу, в которой по году рождения определяется возраст
//        пользователя.
public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var date = Calendar.getInstance();
        System.out.printf("your age is %d", date.get(Calendar.YEAR)- in.nextInt());
        in.close();
    }
}
