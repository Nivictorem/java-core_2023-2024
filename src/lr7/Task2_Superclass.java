package lr7;

public class Task2_Superclass {
    private String str1;
    void Task2_Superclass(String str1)
    {
        this.str1 = str1;
    }
    void SetStr1()
    {
        this.str1 = "";
    }
    void SetStr1(String str1)
    {
        this.str1 = str1;
    }
    Integer GetLengthStr1()
    {
        return this.str1.length();
    }
}
