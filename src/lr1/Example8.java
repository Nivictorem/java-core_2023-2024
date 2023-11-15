package lr1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var day = in.nextLine();
        var month = in.nextLine();
        var data = in.nextLine();
        System.out.printf("%s %s %s", day, data, month);
        in.close();
    }
}
