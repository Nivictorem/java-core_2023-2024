package timus;

import java.util.Scanner;

public class task_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.nextLine();
        num1 = num1.replace("\n", " ");
        String[] nums = num1.split(" ");
        long[] nums_int = new long[nums.length];
        int j = 0;
        for (String i : nums)
        {
            if(i.isEmpty())
            {
                nums_int[j] = -1;
                j++;
                continue;
            }
            nums_int[j] = Long.parseLong(i);
            j++;
        }
        for(int i = nums_int.length-1; i > -1; i--)
        {
            if(nums_int[i] == -1)
                continue;
            double a = Math.sqrt(nums_int[i]);
            a = Math.round(a*10000);
            String str = Double.toString(((double)((long)a)/10000));
            if(str.length() < 6)
            {
                for(j = 0; j <= 7 - str.length(); j++ )
                {
                    str+=0;
                }
            }
            System.out.println(str);
        }

    }
}
