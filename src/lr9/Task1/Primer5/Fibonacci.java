package lr9.Task1.Primer5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(AlgFibonacci(5));
    }
    static int AlgFibonacci(int count)
    {
        //System.out.println("count is " + count);
        if(count == 0)
        {
            return 0;
        } else if (count == 1) {
            return 1;
        }
        else
        {
            int x = AlgFibonacci(count-1);
            System.out.println("x is " + x);
            int y = AlgFibonacci(count-2);
            System.out.println("y is " + y);
            System.out.println("count is " + count + " num is " + (x+y));
            return x+y;
            //return AlgFibonacci(count-1) + AlgFibonacci(count-2);
        }
    }
}
