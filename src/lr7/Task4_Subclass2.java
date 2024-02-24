package lr7;

public class Task4_Subclass2 extends Task4_Subclass1{
    public Task4_Subclass2(String str1, char char1, int int1) {
        super(str1, char1);
        this.int1 = int1;
    }

    int int1;

    public Task4_Subclass2 Task4_Subclass2Copy()
    {
        return new Task4_Subclass2(super.str1, super.char1, this.int1);
    }
}
