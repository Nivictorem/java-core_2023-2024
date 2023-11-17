package lr3;
//Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var a = in.nextLine();
        in.close();
        Variant1(a);
        Variant2(a);
    }

    private static void Variant2(String a) {
        switch (a)
        {
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник":
                System.out.println(2);
                break;
            case "Среда":
                System.out.println(3);
                break;
            case "Четверг":
                System.out.println(4);
                break;
            case "Пятница":
                System.out.println(5);
                break;
            case "Суббота":
                System.out.println(6);
                break;
            case "Воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }

    public static void Variant1(String a)
    {
        if (a.equals ("Понедельник"))
            System.out.println(1);
        else if (a.equals("Вторник") ) {
            System.out.println(2);
        }
        else if (a.equals("Среда")) {
            System.out.println(3);
        }
        else if (a.equals( "Четверг")) {
            System.out.println(4);
        }
        else if (a.equals ("Пятница")) {
            System.out.println(5);
        }
        else if (a.equals ("Суббота")) {
            System.out.println(6);
        }
        else if (a.equals ("Воскресенье")) {
            System.out.println(7);
        }
        else {
            System.out.println("Такого дня нет");
        }

    }
}
