package lr7;

public class Task1_Subclass extends Task1_Superclass{

    private String str3;
    private String str2;
    void Task1_Superclass(String str3, String str2)
    {
        this.str3 = str3;
        this.str2 = str2;
    }
    @Override
    public String toString() {
        return ("name +" + this.getClass().getSimpleName() + "str1 = " + super.GetStr1() +
                "str2 = " + this.str2 +  "str3 = " + this.str3);
    }
}
