package timus;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] poses = new String[n];
        for (int i = 0; i < n; i++)
        {
            poses[i] = in.nextLine();
        }
        for (String i : poses) {
            System.out.println(GetNumPos(i));
        }


    }
    public static int GetNumPos(String pos)
    {
        int[] angle = new int[]{1,1,-1,-1};
        int letter = Character.getNumericValue(pos.charAt(0));
        int letter1 = Character.getNumericValue('b');
        int digit = Integer.parseInt(Character.toString(pos.charAt(1)));
        int hod = 0;
        for(int i = 0; i<4; i++)
        {
            int bounds1 = 2 * angle[i];
            for (int j = 0; j<2; j++)
            {
                int bounds2 = (int)(Math.pow(-1,j));
                int nextPosV = 0;
                int nextPosH = 0;
                if(i%2 == 0)
                {
                    nextPosV = digit + bounds1;
                    nextPosH = letter + bounds2;
                }
                else
                {
                    nextPosV = digit + bounds2;
                    nextPosH = letter + bounds1;

                }
                if(nextPosV >= 1 && nextPosV <= 8 && nextPosH >= Character.getNumericValue('a') && nextPosH <= Character.getNumericValue('h') )
                {
                    hod++;
                }
            }
        }
        return hod;
    }
}
