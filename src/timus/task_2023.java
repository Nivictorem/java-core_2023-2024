package timus;

import java.util.Scanner;

public class task_2023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] name = new String[num];
        in.nextLine();
        for(int i = 0; i < num; i++)
        {
            if(in.hasNextLine())
            name[i] = in.nextLine();
        }
        String[][] names = new String[3][9];
        names[0] = new String[]{"A", "P", "O", "R", "", "", "", "", ""};
        names[1] = new String[]{"B", "M", "S", "", "", "", "", "", ""};
        names[2] = new String[]{"D", "G", "J", "K", "T", "W", "", "", ""};
        int sum = 0;
        int curStep = 0;
        int step = 0;
        for(int i = 0; i < num; i++)
        {
            for(int j =0; j < 3; j++)
            {
                String nameL = String.valueOf(name[i].charAt(0));
                for ( String k : names[j])
                {
                    if(k.equals(nameL))
                    {
                        step = j - curStep;
                        curStep = j;
                        sum += Math.abs(step);
                        break;
                    }
                }

            }
        }
        System.out.println(sum);
        System.out.flush();
    }
}
