package lr3;
//Напишите программу, в которой создается одномерный числовой
//        массив и заполняется числами, которые при делении на 5 дают в остатке 2
//        (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//        Предусмотреть обработку ошибки, связанной с вводом некорректного
//        значения.

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var length = in.nextInt();
        while(length<0)
        {
            System.out.println("Не корректное значение введите новое");
            length = in.nextInt();
        }
        var arrInt = new ArrayList<Integer>();
        for (int i = 0; arrInt.size() < length; i++)
        {
            if(i%5 == 2)
                arrInt.add(i);
        }
        System.out.println(arrInt.toString());
    }
}
