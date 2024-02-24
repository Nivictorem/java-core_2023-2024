package lr7;

public class Task1_Superclass {
    private String str1;

    void Task1_Superclass(String str1)
    {
        this.str1 = str1;
    }

    public String GetStr1()
    {
        return str1;
    }

    @Override
    public String toString() {
        return ("name +" + this.getClass().getSimpleName() + "str1 = " + str1);
    }
}


