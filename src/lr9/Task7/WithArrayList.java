package lr9.Task7;

import java.util.ArrayList;
import java.util.List;

public class WithArrayList {
    public static void main(String[] args) {
        int N = 100000;
        List<Integer> lint = new ArrayList<Integer>();
        long time = System.currentTimeMillis();
        for (int i = 1; i <= N; i++)
        {
            lint.add(i);
        }
//        for (int i : lint
//        ) {
//            System.out.print(i);
//        }
//        System.out.println();
        while (lint.size()>1)
        {
            int count = 1;
            for (int i =0; i<lint.size(); i++)
            {
                if(count%2 == 0)
                {
                    lint.remove(i);
                    i--;
                }
                count++;
            }
//            for (int i : lint
//                 ) {
//                System.out.print(i);
//            }
//            System.out.println();
        }
        System.out.println(time - System.currentTimeMillis());
    }
}
