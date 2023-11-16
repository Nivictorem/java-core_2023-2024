package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var a = in.nextInt();
        System.out.printf("Число %d %s на 3", a, a%3 == 0? "делится" : "не делится");
        in.close();
    }
}
