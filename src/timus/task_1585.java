package timus;

import java.util.Scanner;

public class task_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        in.nextLine();
        int sumEmp = 0;
        int sumMac = 0;
        int SumLittle = 0;
        for(int i =0; i < a; i++)
        {
            String str = in.nextLine();
            switch (str)
            {
                case ("Emperor Penguin"):
                    sumEmp += 1;
                    break;
                case ("Macaroni Penguin"):
                    sumMac += 1;
                    break;
                case ("Little Penguin"):
                    SumLittle += 1;
                    break;
            }
        }
        String mes;
        int maxSum = Math.max(Math.max(sumEmp, sumMac), SumLittle);
        if (maxSum == sumEmp)
        {
            mes = "Emperor Penguin";
        }
        else if (maxSum == sumMac)
        {
            mes = "Macaroni Penguin";
        }
        else
            mes = "Little Penguin";
        System.out.println(mes);

    }
}
