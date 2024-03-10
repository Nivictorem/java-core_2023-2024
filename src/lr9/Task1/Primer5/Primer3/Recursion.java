package lr9.Task1.Primer5.Primer3;

public class Recursion {
    static int step = 0;
    public static void main(String[] args) {
        X(0);

    }
    static void X(int x)
    {
        if(x<20 && x >=0)
        {
            space();
            System.out.println(" " + x + "-> ");
            step++;
            X(2*x + 1);
            step--;
            space();
            System.out.println(" " + x + "-> ");
        }
    }

    private static void space() {
        for(int i =0; i < step; i++)
        {
            System.out.print(" ");
        }
    }
}