package lr13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try{
            int[][] arr = new int[][]{
                    {1,1,1},
                    {1,1,1},
                    {1,1,1},
            };
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            int column = Integer.parseInt(str);
            int[] arrOut = new int[arr.length];
            for(int i = 0; i <  arr.length; i++)
            {
                arrOut[i] = arr[i][column];
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введите целое число");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Такого столбца нет в таблице");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
