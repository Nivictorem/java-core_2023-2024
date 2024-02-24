package lr7;

public class Task3_Subclass extends Task3_Superclass{
    public Task3_Subclass(int int1, char char1) {
        super(int1);
        this.char1 = char1;
    }

    public void SetParam(char char1, int int1) {
        this.char1 = char1;
        super.SetParam(int1);
    }

    char char1;

    public String toString() {
        return this.getClass().getSimpleName() +
                "\nint1 = "+ Integer.toString(int1)+
                "\nchar1 = " + Character.toString(char1);
    }

}
