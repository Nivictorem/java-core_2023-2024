package lr9.Task3;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] array = new int[count];
        SetArray(count, array, in);
    }

    private static void SetArray(int count, int[] array, Scanner in) {
        if(count > 0)
        {
            SetArray(count - 1, array, in);
        }
        if(count == array.length)
            return;
        array[count] = in.nextInt();
        System.out.println("count is " + count + " num is " + array[count]);
    }
}
