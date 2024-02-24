package lr7;

public class Task2_Subclass extends Task2_Superclass{
    int int1;
    void Task2_Subclass(int int1, String str1)
    {
        super.SetStr1(str1);
        this.int1 = int1;
    }
    void SetInt1()
    {
        this.int1 = 0;
    }
    void SetInt1(int int1)
    {
        this.int1 = int1;
    }
    void SetString(String str)
    {
        super.SetStr1(str);
    }

    void SetStrAndInt(String str, int int1)
    {
        SetInt1(int1);
        SetString(str);
    }
}
