package lr1;

import java.util.Calendar;
import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит имя и год рождения,
//        в программа отображает сообщение содержащее имя пользователя и его
//        возраст
public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var date = Calendar.getInstance();
        System.out.printf("%s your age is %d",
                in.nextLine(),
                date.get(Calendar.YEAR)- in.nextInt());
        in.close();
    }
}
