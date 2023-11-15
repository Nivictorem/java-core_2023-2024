package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название месяца \n");
        var month = in.nextLine();
        System.out.print("Введите количество дней в указанном месяце \n");
        String day = in.nextLine();
        System.out.printf("%s содержит %s %s", month, day, ((Integer.parseInt(day)) >4)
                ?"дней":"дня");
        in.close();
    }
}
