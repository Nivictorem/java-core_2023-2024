package lr7;

public class Task3_Superclass {
    public Task3_Superclass(int int1) {
        this.int1 = int1;
    }

    public void SetParam(int int1) {
        this.int1 = int1;
    }

    public int int1;

    public String toString() {
        return this.getClass().getSimpleName() +
                "\nint1 = "+ Integer.toString(int1);
    }
}
