package lr1;

import java.util.Calendar;
import java.util.Scanner;

//Напишите программу, в которой по возрасту определяется год рождения.
public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        var date = Calendar.getInstance();
        System.out.printf("Your birth is %d",
                date.get(Calendar.YEAR)- in.nextInt());
        in.close();
    }
}
