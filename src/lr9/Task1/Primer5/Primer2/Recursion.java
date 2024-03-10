package lr9.Task1.Primer5.Primer2;

public class Recursion {
    public static void main(String[] args) {
        X(0);

    }
    static void X(int x)
    {
        if(x<20 && x >=0)
        {
            X(2*x + 1);
            System.out.println(x);
        }
    }
}
