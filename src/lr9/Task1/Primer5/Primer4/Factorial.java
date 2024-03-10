package lr9.Task1.Primer5.Primer4;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factor(5));
    }
    static int Factor(int n)
    {
        if(n-1>0)
        {
            System.out.println(n);
            return n * Factor(n-1);
        }
        else
            return  1;
    }
}
