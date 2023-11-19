package timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 200;
        int numGuest = in.nextInt();
        for (int i = 0; i < numGuest; i++)
        {
            if(in.next().contains("+one"))
            {
                result+=200;
            }
            else
            {
                result+=100;
            }
        }
        System.out.println(result==1300?1400:result);
        System.out.flush();
    }
}
