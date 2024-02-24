package lr7;

public class Task4_Subclass1  extends Task4_Superclass{
    String str1;

    public Task4_Subclass1(String str1, char char1) {
        super(char1);
        this.str1 = str1;
    }
    public Task4_Subclass1 Task4_Subclass1Copy()
    {
        return new Task4_Subclass1(this.str1, super.char1);
    }
}
