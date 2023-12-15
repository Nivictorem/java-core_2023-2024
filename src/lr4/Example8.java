package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        var str = in.nextLine();
        System.out.println("Введите ключ:");
        var key = in.nextInt();
        String answer;
        System.out.println("текст после преобразования:");
        var charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++)
        {
            charArr[i] = (char)((int)charArr[i] + key);
        }
        System.out.println(new String(charArr));
        System.out.println("Выполнить обратное преобразование?");
        while (true)
        {
            answer = in.nextLine();
            if(answer.equals("y") || answer.equals("n"))
                break;
            else
                System.out.println("Введите корректный ответ");
        }
        System.out.println(str);
        in.close();

    }
}
