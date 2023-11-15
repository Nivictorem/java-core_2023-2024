package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
        var surname = in.nextLine();
        var nextname = in.nextLine();
        System.out.printf("Hello %s %s %s", name, surname, nextname);
        in.close();
    }
}



