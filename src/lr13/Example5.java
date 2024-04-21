package lr13;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e)
        {
            e.printStackTrace();
        }
        System.out.println("2");
    }
}
