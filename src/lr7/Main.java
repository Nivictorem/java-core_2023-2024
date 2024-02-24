package lr7;

public class Main {
    public static void main(String[] args) {
        var a = new Task5_Superclass("Nikita");
        a.DisplayName();
        a = new Task5_Subclass1("Nikita", 1);
        a.DisplayName();
        Task5_Superclass b = a;
        b.DisplayName();
        a = new Task5_Subclass2("Nikita", 'a');
        a.DisplayName();
        b = a;
        b.DisplayName();
    }
}

