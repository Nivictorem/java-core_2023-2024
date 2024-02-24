package lr7;

public class Task4_Superclass {
    char char1;

    public Task4_Superclass(char str1) {
        this.char1 = str1;
    }
    public Task4_Superclass Task4_SuperclassCopy()
    {
        return new Task4_Superclass(this.char1);
    }
}
