package lr13;
//В программе, вычисляющей среднее значение среди положительных элементов
//        одномерного массива (тип элементов int), вводимого с клавиатуры, могут
//        возникать ошибки в следующих случаях:
//        – ввод строки вместо числа;
//        – несоответствие числового типа данных;
//        – положительные элементы отсутствуют.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        try
        {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++)
            {
                String b = in.nextLine();
                Double.parseDouble(b);
                if(b.contains("."))
                {
                    throw new ClassCastException();
                }
                arr[i] = Integer.parseInt(b);
            }
            int sum = 0;
            int positiveCount = 0;
            for (int i : arr)
            {
                if(i>0)
                {
                    sum+= i;
                    positiveCount++;
                }
            }
            System.out.println(sum/positiveCount);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введена строка вместо числа");
        }
        catch (ClassCastException e)
        {
            System.out.println("Введено число с плавающей запятой");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Число положительных данных равно нулю");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
