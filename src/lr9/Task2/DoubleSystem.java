package lr9.Task2;

public class DoubleSystem {
    public static void main(String[] args) {
        Num(10);
    }
    static void Num(int num)
    {
        System.out.print(num%2);
        if(num>1)
        {
            Num(num/2);
        }
    }
}
