package lr4;
//Напишите программу, в которой создается двумерный массив, который
//        выводи прямоугольник из цифр 2;
public class Example3 {
    public static void main(String[] args) {
        var arrStr = new String[10];
        for (var a : arrStr)
        {
            a =  "2".repeat(arrStr.length);
            System.out.println(a);
        }
    }
}
