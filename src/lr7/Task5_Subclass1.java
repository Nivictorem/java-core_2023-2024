package lr7;

public class Task5_Subclass1 extends Task5_Superclass {
    private int int1;

    public Task5_Subclass1(String str1, int int1) {
        super(str1);
        this.int1 = int1;
    }
    public void DisplayName()
    {
        System.out.printf("class name is %s\nstr1 is %s\nint1 is %d\n",
                this.getClass().getSimpleName(), super.getStr1(), int1);
    }
}
