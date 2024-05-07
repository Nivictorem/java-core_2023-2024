package timus;

import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        if(a<5)
        {
            System.out.println("few");
        }
        else if(a<10)
        {
            System.out.println("several");
        }
        else if(a<20)
        {
            System.out.println("pack");
        }
        else if(a<50)
        {
            System.out.println("lots");
        }
        else if(a<100)
        {
            System.out.println("horde");
        }
        else if(a<250)
        {
            System.out.println("throng");
        }
        else if(a<500)
        {
            System.out.println("swarm");
        }
        else if(a<1000)
        {
            System.out.println("zounds");
        }
        else
        {
            System.out.println("legion");
        }
    }
}
