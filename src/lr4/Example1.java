package lr4;

public class Example1 {
    public static void main(String[] args) {
        int height = 11;
        int windth = 23;
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < windth; j++)
            {
                System.out.print("+");
                if (j == windth - 1)
                    System.out.println();
            }
        }
    }
}
