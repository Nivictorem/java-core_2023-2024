package lr13;

import java.util.Scanner;

//В программе, вычисляющей сумму элементов типа byte одномерного массива,
//        вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – ввод или вычисление значения за границами диапазона типа.
public class Task3 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            byte[] bytes = new byte[5];
            for (int  i = 0; i < bytes.length; i++)
            {
                String str = in.nextLine();
                bytes[i] = Byte.parseByte(str);
            }
            byte sum = 0;
            for (byte i : bytes)
            {
                if(127 - sum < i)
                    throw new ArithmeticException();
                sum+=i;
            }
            System.out.println(sum);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введите число типа байт значением от -128 до +127");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Сумма чисел за границами диапазона типа");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
