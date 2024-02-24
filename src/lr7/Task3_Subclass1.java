package lr7;

public class Task3_Subclass1 extends  Task3_Subclass{
    String str1;

    public Task3_Subclass1(int int1, char char1, String str1) {
        super(int1, char1);
        this.str1 = str1;
    }


    public void SetParam(char char1, int int1, String str1) {
        super.SetParam(char1, int1);
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "\nint1 = "+ Integer.toString(int1)+
                "\nchar1 = " + Character.toString(char1) +
                "\nstr1 = " + str1;
    }
}
