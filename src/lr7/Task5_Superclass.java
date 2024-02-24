package lr7;

public class Task5_Superclass {
    private String str1;

    public Task5_Superclass(String str1) {
        this.str1 = str1;
    }
    public String getStr1()
    {
        return str1;
    }
    public void DisplayName()
    {
        System.out.printf("class name is %s\n str1 is %s\n", this.getClass().getSimpleName(), str1);

    }
}
