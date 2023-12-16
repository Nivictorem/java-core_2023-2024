package lr5;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        CallTask6();
    }

    private static void CallTask6() {
        Scanner in = new Scanner(System.in);
        var num1 = in.nextInt();
        var num2 = in.nextInt();
        var t6 = new Task6(num1);
        t6.PrintNums();
        t6 = new Task6(num1, num2);
        t6.PrintNums();
        t6.SetMaxMin(num1);
        t6.PrintNums();
        t6.SetMaxMin(num1, num2);
        t6.PrintNums();
    }

    private static void CallTask5() {
        var t5 = new Task5();
        t5.PrintNum();
        t5 = new Task5(101);
        t5.PrintNum();
        t5 = new Task5(99);
        t5.PrintNum();
        t5.SetInteger();
        t5.PrintNum();
        t5.SetInteger(99);
        t5.PrintNum();
        t5.SetInteger(110);
        t5.PrintNum();
    }

    private static void CallTask4() {
        var t4 = new Task4('a', 1);
        t4.PrintFields();
        t4 = new Task4(65.526);
        t4.PrintFields();
    }

    private static void CallTask3() {
        var t3 = new Task3();
        t3 = new Task3(1);
        t3 = new Task3(1,1);
    }

    public static void CallTask1()
    {
        var t1 = new Task1();
        t1.SetSymb('a');
        t1.PrintSymb();
    }
    public static void CallTask2()
    {
        var t2 = new Task2();
        t2.ch1 = 'A';
        t2.ch2 = 'K';
        t2.PrintAllSymbBetween12();
    }
}
