package lr7;

public class Task5_Subclass2 extends Task5_Superclass{
    private char char1;

    public Task5_Subclass2(String str1, char char1) {
        super(str1);
        this.char1 = char1;
    }
    public void DisplayName()
    {
        System.out.printf("class name is %s\nstr1 is %s\nchar1 is %c\n",
                this.getClass().getSimpleName(), super.getStr1(), char1);
    }
}
