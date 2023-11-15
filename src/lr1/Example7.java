package lr1;


import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
        var age = in.nextLine();
        System.out.printf("Name: %s, Age: %s", name, age);
        in.close();
    }
}