package lr1;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Name: %s, Age: %s", in.nextLine(), in.nextLine());
        in.close();
    }
}